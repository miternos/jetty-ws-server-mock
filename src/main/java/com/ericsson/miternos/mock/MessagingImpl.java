package com.ericsson.miternos.mock;

import com.miternos.messaging.*;

import javax.jws.WebParam;

/**
 * Created with IntelliJ IDEA.
 * User: eilkakk
 * Date: 11/20/13
 * Time: 10:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class MessagingImpl implements Messaging {
    @Override
    public SendMessageResponse send(@WebParam(name = "sender", targetNamespace = "") Sender sender, @WebParam(name = "receiverMsisdn", targetNamespace = "") String receiverMsisdn, @WebParam(name = "message", targetNamespace = "") Message message, @WebParam(name = "transactionId", targetNamespace = "") String transactionId, @WebParam(name = "reportingEntity", targetNamespace = "") ReportingEntity reportingEntity) {
        System.out.println("Sent message : " + message.getContent() + " from:" + sender.getOriginationName() + " to:" + receiverMsisdn);
        SendMessageResponse smr = new SendMessageResponse();
        smr.setErrorCode("0");
        smr.setStatusCode("0");
        smr.setErrorDescription("OK");
        return smr;
    }
}
