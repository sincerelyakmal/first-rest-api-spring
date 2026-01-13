package pl.edu.vistula.firstrestapispring.shared.api.response;

import pl.edu.vistula.firstrestapispring.product.repository.OldProductRepository;

public class ErrorMessageResponse {

    private OldProductRepository productRepository;

    private final String message;

    public ErrorMessageResponse(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

}