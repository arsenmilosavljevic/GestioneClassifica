public class Persona {
    private String nominativo;
    private int punteggio;
    public Object[] classifica;

    public Persona(){

    }
    public Persona(String nominativo, int punteggio){
        setNominativo(nominativo);
        setPunteggio(punteggio);
    }

    public Persona(Persona persona, int punteggio) {
        this();
    }
    public String getNominativo(){
        return nominativo;
    }
    private void setNominativo(String nominativo){
        this.nominativo=nominativo;
    }
    public int getPunteggio(){
        return punteggio;
    }
    private void setPunteggio(int punteggio){
        this.punteggio=punteggio;
    }

    public String toString(){
        return nominativo+" "+punteggio;
    }

    public boolean equals(Persona persona){
        boolean s=false;
        if(this.nominativo.equals(persona.nominativo) && this.punteggio==persona.punteggio){
            s=true;
        }
        return s;
    }
}
