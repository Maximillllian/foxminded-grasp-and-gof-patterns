//package structural_patterns.proxy.src.main.java.com.example.demo;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.oxm.jaxb.Jaxb2Marshaller;
//
//@Configuration
//public class CalculatorConfiguration {
//    @Bean
//    public Jaxb2Marshaller marshaller() {
//        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//        // this package must match the package in the <generatePackage> specified in
//        // pom.xml
//        marshaller.setContextPath("com.example.calculator.wsdl");
//        return marshaller;
//    }
//
//    @Bean
//    public CalculatorFacade calculatorFacade(Jaxb2Marshaller marshaller) {
//        CalculatorFacade client = new CalculatorFacade();
//        client.setDefaultUri("http://www.dneonline.com/calculator.asmx");
//        client.setMarshaller(marshaller);
//        client.setUnmarshaller(marshaller);
//        return client;
//    }
//}
