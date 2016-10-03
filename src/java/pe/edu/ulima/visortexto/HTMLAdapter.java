package pe.edu.ulima.visortexto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class HTMLAdapter implements ModoVisualizacionAdapter {

    @Override
    public ByteArrayOutputStream renderizar(String titulo, String contenido) throws IOException {
        String htmldata = "";

        htmldata += "<html>";
        htmldata += "<head>";
        htmldata += "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\"/>";
        htmldata += "</head>";
        htmldata += "<body class='container'>";
        htmldata += "<h1>" + titulo + "</h1>";
        htmldata += "<div class=\"panel panel-default\">";
        htmldata += "<div class=\"panel-body\">" + contenido + "</div>";
        htmldata += "</div?";
        htmldata += "</body>";
        htmldata += "</html>";

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(htmldata.getBytes());
        return baos;
    }

}
