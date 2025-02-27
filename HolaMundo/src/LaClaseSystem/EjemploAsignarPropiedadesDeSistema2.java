package LaClaseSystem;

import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema2 {
    public static void main(String[] args) {

        try {
            // Abre el archivo de propiedades 'config.properties' en modo lectura
            FileInputStream archivo = new FileInputStream("src/config2.properties");

            // Crea un objeto 'Properties' que obtiene las propiedades del sistema por defecto
            Properties p = new Properties(System.getProperties());

            // Carga las propiedades desde el archivo en el objeto 'p'
            p.load(archivo);

            // Establece una nueva propiedad personalizada en el objeto 'Properties'
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");

            // Establece estas propiedades como las propiedades del sistema
            System.setProperties(p);

            // Obtiene las propiedades del sistema después de haber sido modificadas
            Properties ps = System.getProperties();

            // Imprime el valor de la propiedad 'mi.propiedad.personalizada' que fue configurada previamente
            System.out.println("ps.getProperty(....) = " + ps.getProperty("mi.propiedad.personalizada"));

            // Imprime varias propiedades del sistema que deberían haber sido configuradas en el archivo de propiedades
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));

            // Muestra todas las propiedades del sistema, incluidas las propiedades que acabamos de cargar
            ps.list(System.out);
        } catch (Exception e) {
            // Si ocurre alguna excepción, imprime un mensaje de error
            System.out.println("No existe el archivo = " + e);
            System.exit(1);
        }

    }
}
