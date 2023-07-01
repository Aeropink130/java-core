package enumeraciones;

public enum Continenetes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    //ATRIBUTO PAISES
    private final int paises;

    //cosntructor
    Continenetes(int paises) {
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }

}
