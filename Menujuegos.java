public class Menujuegos{
    
    public Menujuegos(){}
    
    public String menuJuegos(){
        String menu = "\n Seleccione el juego que desea \n 1. Rompecabezas \n 2. Laberinto \n 3. Colores y formas \n 4. Memoria";
        return menu;
    }
    
    public String menujuegos2(){
        String menu2 = "\n Seleccione la opción que desea \n 1. Iniciar juego \n 2. Informacion del juego \n 3. Salir";
        return menu2;
    }
    
    public String infoRompecabezas(){
        String infor = "Rompecabezas\n" +
        "Armar rompecabezas tiene muchos beneficios para los niños pequeños, pueden ayudar a mejorar sus habilidades \n cognitivas y emocionales, pues trabajaran la memoria, la coordinación de sus ojos y sus manos y la resolución de problemas,\n mientras que en el lado emocional trabajarán la paciencia y la confianza en si mismos.";
        return infor;
    }
    
    public String infoLaberinto(){
        String infol = "Laberinto\n" +
        "El juego del laberinto tiene grandes beneficios para los pequeños cuando lo juegan, se sabe que puede mejorar mucho su atención y concentración, también es muy beneficioso para mejorar su habilidad de resolución de problemas desde una pequeña edad, además ayuda a desarrollar una mejor percepción visual, orientación espacial y desarrolla confianza en si mismos.";
        return infol;
    }
    
    public String infoCyF(){
        String infocyf = "Formas y colores\n"+
    "Para los niños de edades cortas, clasificar las cosas ya sea haciendo series, agrupando o separando los objetos es un método grandioso para que desde chiquitos puedan empezar a desarrollar sus habilidades lógicas, lo cual será bueno para sus capacidades en la matemática. Los colores son un buen criterio para que el niño pueda clasificar las cosas diferentes pues se les facilita reconocerlos y tener buen desempeño en su aprendizaje.\n"+
    "De la misma forma, enseñar las figuras geométricas al niño desde muy pequeño puede ayudar a que su capacidad espacial y su lógica se desarrolle mejor.";
        return infocyf;
    }
    
    public String infoMemoria(){
        String infomem = "Memoria\n"+
        "Este juego tiene muchísimos beneficios en los pequeños  pues mediante este juego ellos pueden mejorar la memoria visual, trabajar muchas otras habilidades cognitivas, ejercitar su cerebro, trabajar en su concentración y motivar el pensamiento rápido.";
        return infomem;
    }
}
