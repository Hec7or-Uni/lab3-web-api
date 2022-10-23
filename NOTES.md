## Methods

### `POST` 

- [ ] Seguro
- [ ] Idempotente

### `GET`

- [X] Seguro
- [X] Idempotente

### `PUT`

- [ ] Seguro
- [X] Idempotente

### `DELETE`

- [ ] Seguro
- [X] Idempotente

## Setup block

### `POST` 

- [ ] Ensure in first call that the repository save the employee with `id = 1` and with `id = 2` in the second call.
- [ ] Ensure in first call that the repository does not contain an employee with `id = 1` and a specific employee in the second call.

### `GET`

- [ ] Ensure that the repository returns a specific employee with `id = 1`.
- [ ] Ensure that the repository does not contain an employee with `id = 2`.

### `PUT`

- [ ] Ensure that the repository save the employee withouth modifying its `id`.

### `DELETE`

- [ ] Ensure that the call to delete an employee identified by `id = 1` works.

- [ ] Ensure in first call that the repository contain a specific with `id = 1` and none identified by `id = 1` in the second call.

## Verify block

### `POST` 

- [ ] Verify that `save` has been called twice with a new employee without `id`.

### `GET`

- [ ] Verify methods that modify the repository have not been invoked.

- [ ] Verify that `findById(1)` has been called twice.

### `PUT`

- [ ] Verify that `save` has been called twice with an employee with `id = 1`.

### `DELETE`

- [ ] Verify that `deleteById(1)` has been called once.

