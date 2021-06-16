<%-- 
    Document   : formualrio
    Created on : 16-jun-2021, 16:20:51
    Author     : SergioCaballeroSáez
--%>

<%@page import="modelo.Coordenada"%>
<%@page import="modelo.Tiro"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tiro Parabólico</h1>
        <%ArrayList<String> lista = (ArrayList) request.getAttribute("lista");%>
        <%ArrayList<Coordenada> listaCoordenadas = new ArrayList();%>
        <%
            Tiro ti = (Tiro) request.getAttribute("ti");
            String velocidad = (String) request.getAttribute("velocidad");
            String angulo = (String) request.getAttribute("angulo");
            
            if(ti == null){
                 velocidad="";
                 angulo = 0;
                
                ti = new Tiro(velocidad, angulo);
                ti.getAlturaMaxima();
                ti.getAlcanceMaximo();
                
            }
            %>
        
        
        <form action="action">
            Velocidad (m/s): <input type="number" name="velocidad" value="<%=velocidad%>"><br>
            Ángulo: <select name="Angulo">
                <%
                    for(String t : lista){
                        String seleccion = "";
                        if(t.equals(String.valueOf(ti.getAngulo()))){
                            seleccion = "selected";
                        }
                    }
                
                    
                    %>
                    <option></option>
            </select>
            <br>
            <input type="submit" value="Lanzar">
            
        </form>
    </body>
</html>
