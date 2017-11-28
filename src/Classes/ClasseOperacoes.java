
package Classes;

public class ClasseOperacoes {
    
    private static String opcaoEscolhida ;
    private float a;
    private float b;
    private int i;
    
    public float calculos(){
        float resultado = 0;
        float deltaX = 0;
        int tamanho = i+1;
        float xi[] = new float[tamanho];
        float fX[] = new float[tamanho];
        float temp = a;
        float somaMult = 0;
        
        deltaX = (b - a)/i;
        
        System.out.println("Delta X : "+deltaX);
        
        for(int l = 0; l < tamanho; l++){
            xi[l] = temp;
            
            //metodos diferentes dependendo da escolha do tipo da funcao
            if(this.opcaoEscolhida == "a"){
                fX[l] = this.opcaoA(xi[l]); //fX[l] = 1 / xi[l];
            }else if(this.opcaoEscolhida == "b"){
                fX[l] = this.opcaoB(xi[l]);
            }else if(this.opcaoEscolhida == "d"){
                fX[l] = this.opcaoD(xi[l]);
            }else if(this.opcaoEscolhida == "e"){
                fX[l] = this.opcaoE(xi[l]);
            }
            
            
            
            
            temp = xi[l] + deltaX;
            System.out.printf("\nX%d = %.2f -- Fx(%d) = %.2f", l,xi[l],l,fX[l]);
        }
        
        for(int l = 1; l < tamanho - 1; l++){
            somaMult += (fX[l]*2);
        }
        
        System.out.println("\n\nSomas e multiplicações internas : "+somaMult);
        
        somaMult += fX[0] + fX[tamanho-1];
        
        System.out.println("Total das somas da tabelinha: "+somaMult);
        
        resultado = (deltaX * somaMult) / 2;
        
        System.out.println("Resultado : "+resultado);
        
        return resultado;
    }
    
    public float opcaoA(float n){ 
        return 1 / n;
    }
    
    public float opcaoB(float n){
        return 1 / (float)(Math.pow(n,2));
    }
    
    public float opcaoD(float n){
        return (float)Math.pow(Math.E,3*n);
    }
    
    public float opcaoE(float n){
        return (float)Math.pow(Math.E,(Math.pow(n,2)));
    }

    public static String getOpcaoEscolhida() {
        return opcaoEscolhida;
    }

    public static void setOpcaoEscolhida(String opcaoEscolhida) {
        ClasseOperacoes.opcaoEscolhida = opcaoEscolhida;
    }
   
    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
    
}
