public class GestioneClassifica {
    private Persona[] classifica;
    private int num_max_persone=10;

    public GestioneClassifica(){
        classifica = new Persona[num_max_persone];
    }

    public GestioneClassifica(Persona persona){
        this();
        for (int i = 0; i < num_max_persone; i++) {
            if(classifica[i]!=null){
                classifica[i]=aggiungiPersona(persona.classifica[i],i);
            }
        }
    }

    public int aggiungiPersona(Persona persona, int punteggio){
        int rest=-1;
        if(classifica.getNum()<num_max_persone)
        if(punteggio>=0 && punteggio<num_max_persone && getPersona(punteggio)==null){
            classifica[punteggio]=new Persona(persona,punteggio);
            rest=punteggio;
        }else{
            spostadx(punteggio);
            classifica[punteggio]=new Persona(persona,punteggio);
        }
    }

    public Persona getPersona(int punteggio){
        return classifica[punteggio];
    }

    public int cercaPersona(String nominativo){
        int rest=-1;
        int i=0;
        while(rest==-1 && i<num_max_persone){
            if(classifica[i].getNominativo().equals(nominativo)){
                rest=i;
            }
            i++;
        }
        return rest;
    }
    public void spostadx(int inizio){
        if(classifica[num_max_persone-1]==null){
            for (int i = num_max_persone-1; i > inizio; i--) {
               classifica[i]=classifica[i-1];
            }
        }
    }
    public void spostasx(int inizio){
        for (int i = inizio; i <num_max_persone; i++) {
            classifica[i]=classifica[i+1];
        }
    }

    public int getNum(){
        int conta=0;
        for (int i = 0; i < num_max_persone; i++) {
            if(getPersona(i)!=null){
                conta++;
            }
        }
        return conta;
    }


    public int togliPersona(String nominativo){

    }

    public String toString(){
        String s="";
        for (int i = 0; i < num_max_persone; i++) {
            if(classifica[i]!=null){
                s += i+" Nome del soggetto: "+classifica[i].getNominativo()+ ", ha punteggio: "+classifica[i].getPunteggio();
            }else{
                s += i+" Casella vuota";
            }
        }
        return s;
    }

    public double media(){

    }

    public GestioneClassifica estrazionePersoneconPunteggioInferiore(int punteggio){

    }


}
