public class Laboratoire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Souris s1 = new Souris(50, "blanche", 2);
        Souris s2 = new Souris(45, "grise");
        Souris s3 = new Souris(s2);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        s1.vieillir();
        s1.vieillir();
        System.out.println(s1);
        
        s1.evolue();
        s2.evolue();
        s3.evolue();
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
                
    }
    
}
