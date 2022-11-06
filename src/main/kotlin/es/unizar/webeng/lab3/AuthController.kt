package es.unizar.webeng.lab3

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthController() {

    // This shouldnt be here :)
    val appSecret = "b0038186c7d60a53be22a5ad290c5fcb"

    @PostMapping("/auth")
    fun newEmployee(@RequestBody user: Auth): String {
        val claims : HashMap<String, Any?> = HashMap<String, Any?>();
        claims.put("iss", "jwt-auth0");
        claims.put("sub", "AccessToken");
        claims.put("name", user.fullName);
        claims.put("generatedTimestamp", Date().time);

        val expiryDate : Date = DateUtils.addHours(Date(), 1);

        val accessToken : String = Jwts.builder()
            .setClaims(claims)
            .setExpiration(expiryDate)
            .signWith(SignatureAlgorithm.HS256, appSecret)
            .compact();

        return ResponseEntity.ok(accessToken)
    }
}