package pe.edu.cibertec.T2_SW_OrtizPelaezLuisHumberto.exception;
@SoapFault(faultCode = FaultCode.SERVER)
public class ResourceNotFoundException {
    public NotFoundException(String message) {
        super(message);
    }
}
