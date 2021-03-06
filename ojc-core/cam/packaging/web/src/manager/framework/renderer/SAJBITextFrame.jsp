<?xml version="1.0" encoding="UTF-8"?>

<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">

    <jsp:directive.page contentType="text/html;charset=ISO-8859-1" pageEncoding="UTF-8"/>
    
    <f:view>
        <webuijsf:page frame="true">
            <webuijsf:html>
                <f:loadBundle basename="com.sun.jbi.cam.common.resources.Bundle" var="msgs" />
                <webuijsf:head title="#{SVGRendererBean.JBITexttitle}" />
                
                <webuijsf:contentPageTitle id="pagetitle" title="#{SVGRendererBean.JBITexttitle}" helpText="" />    
                <br></br>
                <pre>
                <webuijsf:staticText style="font-size:small" text="#{SVGRendererBean.JBIXmlText}" />
                </pre>
                
                     
            </webuijsf:html>
        </webuijsf:page>
    </f:view>

</jsp:root>


