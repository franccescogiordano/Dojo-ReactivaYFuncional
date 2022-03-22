public class Derivacion {
    public int grado;
    public double []coeficiente;

    public Derivacion(int grado, double []coeficiente) {
        this.grado = grado;
        this.coeficiente = coeficiente;
    }

    public String mostrarpolinomio(){
        String Derivada = " ";
        int subindice = 0;
        int exponente = 0;
        for(subindice=this.grado; subindice>0; subindice--){
            exponente = subindice;
            if(subindice == 0){
                Derivada+= " "+this.coeficiente[subindice];
            }
            else {
                Derivada+= " "+ this.coeficiente[subindice]+"("+ "x^"+exponente+")+";
            }

        }
        return Derivada;
    }
    public void Derivar(int numeroderivada){
        int gradoDerivada = 0;
        double []coeficienteDerivada = {0};
        for(int i=1;i<=numeroderivada;i++) {
            gradoDerivada = this.grado-1;
            coeficienteDerivada = new double[this.grado];
            int subindice=0;
            for(int j=1; j<=this.grado; j++) {
                coeficienteDerivada[subindice] = j*this.coeficiente[j];
                subindice++;
            }
            this.grado = gradoDerivada;
            this.coeficiente = coeficienteDerivada;
        }
    }

    public double exponente(double coeficiente, int grado){
        double resultado = 1;
        for(int i=1; i<=this.grado; i++){
            resultado*=coeficiente;
        }
        return resultado;
    }

}
