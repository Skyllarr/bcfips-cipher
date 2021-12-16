import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException, KeyManagementException {

        SSLContext sslContext = SSLContext.getInstance("TLSV1.2", Security.getProvider("SunJSSE"));
        sslContext.init(null, null, null);

        System.out.println("Provider of SSL Context is: " + sslContext.getProvider().getName());
//        System.out.println("TLS_DHE_DSS_WITH_AES_128_CBC_SHA is among supported cipher suites: " +
//                Arrays.asList(sslContext.getServerSocketFactory().getSupportedCipherSuites()).contains("TLS_DHE_DSS_WITH_AES_128_CBC_SHA"));
        System.out.println(sslContext.getProvider().getInfo());
      System.out.println(Arrays.asList(sslContext.getServerSocketFactory().getSupportedCipherSuites()));
    }
}
