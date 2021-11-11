package resolucaotela;
import java.awt.*;
import java.util.Locale;

public class ResolucaoTela {

    public static void main(String[] args) {
        
        // getScreenSize() retorna o tamanho da tela em pixels
        Dimension size =  Toolkit.getDefaultToolkit().getScreenSize();
        
        // Width irá armazenar a altura da tela
        
        int width = (int)size.getWidth();
        
        // Height irá armazenar a largura da tela
        
        int height = (int)size.getHeight();
        
        System.out.println("Resolução da tela atual: \n"
                            + "Altura: " + width + " pixels \n"
                            + "Largura: " + height + " pixels");
    }
    
    
}
