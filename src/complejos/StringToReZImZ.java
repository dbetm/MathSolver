package complejos;

/**
 *
 * @author Carlos
 */

public class StringToReZImZ {
    float ReZ = 0; 
    float ImZ = 0; 
    String cadena; 
    
    StringToReZImZ() {}

    public float[] Separar(String cadena){
        String aux;
        float[] complejoSeparado = new float[2];
        
        if(cadena.length() == 1 && cadena.contains("i")) {
            complejoSeparado[0] = 0;
            complejoSeparado[1] = 1;
            ReZ = 0;
            ImZ = 1;
            return complejoSeparado;
        }
        if(cadena == "-i") {
            complejoSeparado[0] = 0;
            complejoSeparado[1] = -1;
            ReZ = 0;
            ImZ = -1;
            return complejoSeparado;
        }
      
        //Primero leemos la cadena 
        //Separamos la parte Real y la imaginaria
        if(cadena.startsWith("-")) {
            if(cadena.length()<=2) {
                if(cadena.contains("i")) { // -i
                    ImZ = -1; 
                    ReZ = 0; 
                }else { //-n, donde n={1,2,3,4,5,6,7,8,9} y nada más
                    ImZ = 0; 
                    ReZ = Float.parseFloat(cadena); 
                }
            }else {
                //La cadena mide más de 2
                int NumeroDeMenos = cadena.length()
                                  - cadena.replace("-","").length(); 
                //System.out.println("Numero de Menos: "+NumeroDeMenos);
              
                if((NumeroDeMenos)>1){ //-a-ib
                  
                    //System.out.println(cadena);
                    String [] partes = cadena.split("-");
                  
                  
                    if(partes[1].contains("i")){
                        partes[1] = partes[1].replace("i", "");
                        
                        if(partes[1].length() == 0) ImZ = -1;
                        else ImZ = Float.parseFloat(partes[1])*-1; 
                        
                        ReZ = Float.parseFloat(partes[2])*-1; 
                    }

                    if(partes[2].contains("i")){
                        partes[2] = partes[2].replace("i", ""); 
                        if(partes[2].length() == 0) ImZ = -1;
                        else ImZ = Float.parseFloat(partes[2])*-1; 
                        ReZ = Float.parseFloat(partes[1])*-1; 
                    }
                  
                  
                }else{//-a || -bi || -a+bi || -bi+a
                    if(cadena.contains("+")){//-a+bi || -bi+a
                        //System.out.println("Contiene + en la parte 2");
                        String[] partes = cadena.split("\\+"); 

                        if(partes[0].contains("i")){
                            partes[0] = partes[0].replace("i", "");
                            partes[0] = partes[0].replace("-", ""); 

                            if(partes[0].length() == 0) ImZ = -1;
                            else{
                                ImZ = Float.parseFloat(partes[0])*-1; 
                            }

                          ReZ = Float.parseFloat(partes[1]); 
                        }

                        if(partes[1].contains("i")){
                            partes[1] = partes[1].replace("i", ""); 
                            if(partes[1].length() == 0) ImZ = 1;
                            else ImZ = Float.parseFloat(partes[1]); 

                            ReZ = Float.parseFloat(partes[0]); 
                        }
 
                    }else{
                        //System.out.println("Es un numero > 9");
                        if(cadena.contains("i")){ //-bi con b>9
                            aux = cadena.replace("i", ""); 
                            ImZ = Float.parseFloat(aux);
                        }else //-a con a>9
                            ReZ = Float.parseFloat(cadena);             
                    }
                }
            }
          
          
        }else{
            if(cadena.contains("+")){//a+bi || bi + a
                String[] partes = cadena.split("\\+"); 
                if(partes[0].contains("i")){
                    partes[0] = partes[0].replace("i", ""); 
                    if(partes[0].length() == 0) ImZ = 1; 
                    else ImZ = Float.parseFloat(partes[0]);
                    ReZ = Float.parseFloat(partes[1]); 
                }
        
                if(partes[1].contains("i")){
                    partes[1] = partes[1].replace("i", ""); 
                    if(partes[1].length() == 0) ImZ = 1; 
                    else ImZ = Float.parseFloat(partes[1]); 
                    ReZ = Float.parseFloat(partes[0]); 
                }
            }
            else if(cadena.contains("-")){//a-bi || bi - a
                String[] partes = cadena.split("\\-"); 
                if(partes[0].contains("i")){
                    partes[0] = partes[0].replace("i", ""); 
                    if(partes[0].length() == 0) ImZ = 1;
                    else ImZ = Float.parseFloat(partes[0]);
                    
                    ReZ = Float.parseFloat(partes[1])*-1; 
                }
        
                if(partes[1].contains("i")){
                   partes[1] = partes[1].replace("i", ""); 
                   if(partes[1].length() == 0) ImZ = -1; 
                   else ImZ = Float.parseFloat(partes[1])*-1;
                   
                   ReZ = Float.parseFloat(partes[0]);
                }
          
            }else{ // a || bi
                if(cadena.contains("i")){ //bi
                   cadena =  cadena.replace("i", "");
                   ImZ = Float.parseFloat(cadena); 
                }else
                    ReZ = Float.parseFloat(cadena);
            }
        }
        // asignamos a las dos posiciones del arreglo, la parte real e imaginaria
        complejoSeparado[0] = ReZ;
        complejoSeparado[1] = ImZ;
        
        return complejoSeparado;
    }
    
    
    
    // VALIDACIÓN DE ENTRADA
    
    public static String validar(String cadena) {
        String resultado = "Error: ";
        if(cadena.isEmpty()) return "Error: Escriba una entrada";
        // ######## FILTROS #######
        
        // Quitamos los espacios en blanco
        cadena = cadena.replace(" ", "");
        
        // Validamos la cantidad de operadores, 
        //  dos máximos para el "menos" y uno para el "más".
        if(!validarOperadores(cadena)) {
            resultado += "Expresión mal formada por '-' o '+' sobrantes.";
        }
        // Validamos la aparición de carácteres raros
        else if(!validarCaracteresRaros(cadena)) {
            resultado += "Expresión inválida.";
        }
        else resultado = cadena;
        
        return resultado;
    } 
    
    
    private static boolean validarOperadores(String cadena) {
        boolean respuesta = true;
        int operadorSuma = 0, operadorResta = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == '+') operadorSuma++;
            if(cadena.charAt(i) == '-') operadorResta++;
            if(operadorSuma > 1 || operadorSuma > 2) {
                respuesta = false;
                break;
            }
        }
        
        return respuesta;
    }
    
    private static boolean validarCaracteresRaros(String cadena) {
        boolean respuesta = true;
        
        for (int i = 0; i < cadena.length(); i++) {
            /* VALIDAR DE ACUERDO AL CÓDIGO ASCII
                + => 43
                - => 45
                . => 46
                / => 47
                [0,9] => [48,57]
                i => 105
                j => 106
            */ 
            if((int)cadena.charAt(i) != 43 && ( (int)cadena.charAt(i) < 44 || 
                    (int)cadena.charAt(i) > 58) && (int)cadena.charAt(i) != 105 &&
                    (int)cadena.charAt(i) != 106) {
                respuesta = false;
                break;
            }
        }
        
        return respuesta;
    }

    // Métodos de acceso
    
    public float getReZ() {
        return ReZ;
    }

    public void setReZ(float ReZ) {
        this.ReZ = ReZ;
    }

    public float getImZ() {
        return ImZ;
    }

    public void setImZ(float ImZ) {
        this.ImZ = ImZ;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    
    // TESTEO
    public static void main(String[] args){
        StringToReZImZ lol = new StringToReZImZ(); 
        String cadena = "i";
        
        cadena = StringToReZImZ.validar(cadena);
        
        if(cadena.contains("Error")) {
            System.out.println(cadena);
        }
        else {
            float[] partes = lol.Separar(cadena);
            System.out.println(partes[0] + "\n" + partes[1]);
        }
    }
    
}