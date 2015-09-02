package mx.uach.fing.classroom.lambda;

import java.util.ArrayList;
import java.util.List;
import mx.uach.fing.manejoarticulo.datos.Articulo;

/**
 *
 * @author Sara Rodriguez Soto
 */
public class LambdaArticulos {

    public static void main(String[] args) {
        List<Articulo> articulos = new ArrayList<>();
        articulos.add(new Articulo("01", "Pastillas Sanitarias", 23));
        articulos.add(new Articulo("02", "Limpiadores líquidos",20));
        articulos.add(new Articulo("03", "Jabón de barra", 10));
        articulos.add(new Articulo("04", "Cloro para ropa", 15));
        articulos.add(new Articulo("05", "Insecticidas",30));
        articulos.add(new Articulo("06", "Fibras limpiadoras",9.50));
        articulos.add(new Articulo("07", "Soda", 22));
        articulos.add(new Articulo("08", "Limpiadores líquidos",20));
        articulos.add(new Articulo("09", "Detergentes para trastes", 11.50));
        articulos.add(new Articulo("10", "Aceite comestibles", 17));
        articulos.add(new Articulo("11", "Consome",4.50));
        articulos.add(new Articulo("12", "Crema para café",19));
        articulos.add(new Articulo("13", "Pure de tomate", 10.50));
        articulos.add(new Articulo("14", "Avena",22));
        articulos.add(new Articulo("15", "Azucar", 16.50));
        articulos.add(new Articulo("16", "Cafe", 15));
        articulos.add(new Articulo("17", "Especias",5.50));
        articulos.add(new Articulo("18", "Vinagre",17.50));
        articulos.add(new Articulo("19", "Champiñones enteros/rebanados", 23));
        articulos.add(new Articulo("20", "Chícharo con zanahoria",20));
        articulos.add(new Articulo("21", "Frijoles enlatados", 10));
        articulos.add(new Articulo("22", "Frutas en almíbar", 15));
        articulos.add(new Articulo("23", "Sardinas",25));
        articulos.add(new Articulo("24", "Leche deslactosada",9.50));
        articulos.add(new Articulo("25", "Crema", 13.50));
        articulos.add(new Articulo("26", "Atún en agua/aceite",20));
        articulos.add(new Articulo("27", "Tortillas de harina/maíz", 11.50));
        articulos.add(new Articulo("28", "Mazapán", 5));
        articulos.add(new Articulo("29", "Malvaviscos",14));
        articulos.add(new Articulo("30", "Gomas de mascar",2));
        articulos.add(new Articulo("31", "Chocolates", 8.50));
        articulos.add(new Articulo("32", "Cacahuates",6));
        articulos.add(new Articulo("33", "Palomitas", 10));
        articulos.add(new Articulo("34", "Media cremaCafe", 11));
        articulos.add(new Articulo("35", "Yoghurt",15.50));
        articulos.add(new Articulo("36", "Mantequilla",7.50));

        System.out.println("Print articles with for");
        for (int i = 0; i < articulos.size(); i++) {
            System.out.println(articulos.get(i));
        }
        
        System.out.println("Print articles count (price > 20) with lambda");
        long articuloCount = articulos.stream()
                .filter((articulo) -> 20 < articulo.getprecio())
                .count();
        System.out.printf("Article count: %d\n", articuloCount);
        
         System.out.println("Print articles count (price < 15) with lambda");
        long articulosCount = articulos.stream()
                .filter((articulo) -> 15 < articulo.getprecio())
                .count();
        System.out.printf("Article count: %d\n", articuloCount);
        
    }

    public static class Articulo {

        private String descripcion;
        private int precio;
        private String clasificacion;

        public Articulo(String descripcion, int precio, String clasificacion) {
            this.descripcion = descripcion;
            this.precio = precio;
            this.clasificacion = clasificacion;
        }

        public String getdescricion() {
            return descripcion;
        }

        public void setdescripcion(String descripcion) {
            this.descripcion= descripcion;
        }

        public int getprecio() {
            return precio;
        }

        public void setprecio(int precio) {
            this.precio = precio;
        }

        public String getclasificacion() {
            return clasificacion;
        }

        public void setclasificacion(String clasificacion) {
            this.clasificacion = clasificacion;
        }

        @Override
        public String toString() {
            return String.format("%s %s Tiene %d",
                    this.descripcion, this.precio, this.clasificacion);
        }

    }

}
