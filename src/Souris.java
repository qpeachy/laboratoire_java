public class Souris {
    
    private static final int ESPERANCE_VIE_DEFAULT = 36;

    private int _poids;
    private String _couleur;
    private int _age;
    private int _esperanceVie;
    private boolean _clonee;


    public int get_poids() {
        return _poids;
    }

    public void set_poids(int _poids) {
        this._poids = _poids;
    }

    public String get_couleur() {
        return _couleur;
    }

    public void set_couleur(String _couleur) {
        this._couleur = _couleur;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public int get_esperanceVie() {
        return _esperanceVie;
    }

    public void set_esperanceVie(int _esperanceVie) {
        this._esperanceVie = _esperanceVie;
    }

    public boolean is_clonee() {
        return _clonee;
    }

    public void set_clonee(boolean _clonee) {
        this._clonee = _clonee;
    }


    /**
     * @param poids
     * @param couleur
     * @param age
     * @param esperanceVie
     * @param clonee
     */
    public Souris(int poids, String couleur, int age, int esperanceVie) {
        this._poids = poids; //en grammes
        this._couleur = couleur;
        this._age = age; //en mois
        this._esperanceVie = esperanceVie;
        this._clonee = false;
        System.out.println("Une nouvelle souris!");
    }

    Souris(int poids, String couleur, int age) {
        this._poids = poids;
        this._couleur = couleur;
        this._age = age;
        this._esperanceVie = ESPERANCE_VIE_DEFAULT; 
        this._clonee = false;
        System.out.println("Une nouvelle souris!");
    }

    Souris(int poids, String couleur) {
        this._poids = poids;
        this._couleur = couleur;
        this._age=0;
        this._esperanceVie = ESPERANCE_VIE_DEFAULT;
        this._clonee = false;
        System.out.println("Une nouvelle souris!");
    }
    
    Souris(Souris souris){
        this._poids = souris._poids; //en grammes
        this._couleur = souris._couleur;
        this._age = souris._age; //en mois
        this._esperanceVie = souris._esperanceVie * 4/5;
        this._clonee = true;
        System.out.println("Clone d'une Souris!");
    }

    @Override
    public String toString() {
        String result;
       result =  "Une souris "+ this._couleur +" ";
       if (_clonee== true){ result+= "clonée ";}
       result +=  "de " + this._age+ " mois et pesant "+this._poids + " grammes";
        
       
        return (result);
    }

    public int vieillir(){
        _age = _age + 1;
        if(this._clonee == true){
            if (_age > _esperanceVie/2){
                _couleur= "verte";
        }}
        return _age;
    }

    public void evolue(){
        while (_age < _esperanceVie){
            vieillir();
        }
    }
}
