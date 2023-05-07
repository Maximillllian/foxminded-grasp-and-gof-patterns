//package com.example.demo;
//
//import com.example.calculator.wsdl.*;
//import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
//import org.springframework.ws.soap.client.core.SoapActionCallback;
//
//public class CalculatorFacade extends WebServiceGatewaySupport implements Calculator {
//
//    private static final String ADD_SOAP_ACTION = "http://tempuri.org/Add";
//    private static final String DIVIDE_SOAP_ACTION = "http://tempuri.org/Divide";
//    private static final String MULTIPLY_SOAP_ACTION = "http://tempuri.org/Multiply";
//    private static final String SUBTRACT_SOAP_ACTION = "http://tempuri.org/Subtract";
//    private static final String WSDL_URL = "http://www.dneonline.com/calculator.asmx?wsdl";
//
//    public int add(int a, int b) {
//        var addRequest = new Add();
//        addRequest.setIntA(a);
//        addRequest.setIntB(b);
//        var response = (AddResponse) getWebServiceTemplate()
//                .marshalSendAndReceive(WSDL_URL, addRequest, new SoapActionCallback(ADD_SOAP_ACTION));
//
//        return response.getAddResult();
//    }
//
//    public int divide(int a, int b) {
//        var divideRequest = new Divide();
//        divideRequest.setIntA(a);
//        divideRequest.setIntB(b);
//        var response = (DivideResponse) getWebServiceTemplate()
//                .marshalSendAndReceive(WSDL_URL, divideRequest, new SoapActionCallback(DIVIDE_SOAP_ACTION));
//
//        return response.getDivideResult();
//    }
//
//    public int multiply(int a, int b) {
//        var multiplyRequest = new Multiply();
//        multiplyRequest.setIntA(a);
//        multiplyRequest.setIntB(b);
//        var response = (MultiplyResponse) getWebServiceTemplate()
//                .marshalSendAndReceive(WSDL_URL, multiplyRequest, new SoapActionCallback(MULTIPLY_SOAP_ACTION));
//
//        return response.getMultiplyResult();
//    }
//
//    public int subtract(int a, int b) {
//        var subtractResponse = new Subtract();
//        subtractResponse.setIntA(a);
//        subtractResponse.setIntB(b);
//        var response = (SubtractResponse) getWebServiceTemplate()
//                .marshalSendAndReceive(WSDL_URL, subtractResponse, new SoapActionCallback(SUBTRACT_SOAP_ACTION));
//
//        return response.getSubtractResult();
//    }
//}
