package it.nextre.academy.myutils;

import java.util.Random;

public class DammiDato{
    private static Random r= new Random();
    private static final String lettereNumeri="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String CaratteriSpeciali="!$=&_-";
    private static String[] citta ={"Stonebutter","Mount Prospect","Independent Hill","Cape Town","Moreno Valley","Temecula",
            "Sydney","Amarillo","Lafayette","Beijing","Murfreesboro","Carrollton","Wilmington","Basseterre","Thousand Oaks","Moscow",
            "Dorchester","Biloxi","East Orange","Peterson Afb","Flower Mound","Lawrence","Salt Lake City","Vientiane","Verdi","Santa Rosa",
            "Canton","Belmopan","Mobile","Nashville","Vienna","Elwin","Swan Island","Silver Spring","Evansville","Monterey Park","Black Mtn",
            "Metairie","London","Pocatello","Oakland","Nouakchott","Maclay State Gardens","Farmington","Taylorsville","Langley View","Pomona",
            "East Albany","Pisgah Church","Burnsville","Rapid City","Arden-arcade","Oslo","Guaynabo","Bogot","North Virginia Beach","Aguilares",
            "Tarawa","Phoebus","Newbury","Lynnhaven","Hyde Park","Turner City","Ankara","Victoria","Redwood City","Orange","Jacksonville","South Bend",
            "Lake Forest","Mexico City","Bridgeport","Monrovia","Easton","Gulfport","Boca Raton","Ridgewood","Concord","Oceanway","Douglas Park","Towson",
            "Osgood","Portland","Lynwood","Lancaster","Oshkosh","Wellington","Hayward","Barcroft","Lauderhill","Pine Bluff","Stepanakert","Elyria","Berwyn",
            "Rancho Cucamonga","Waialae","San Mateo","Kingstown","Winterhaven","Missouri City","Santa Barbara","Lincoln","Johnson City","Johnson Bayou",
            "Lake Ashby","Port of Spain","Alexandria","Freetown","Avarua","Johns Island","Howard Beach","Kabul","Oceana","Brazzaville","Delray Beach",
            "Battery Point","Meriden","Clifton","Harlem","Columbia","Montgomery","Nicosia","Willoughby Spit","Park Heights","Simpson","Chula Vista",
            "Ventura","Carlsbad","Santa Clarita","Asheville","Chino Hills","La Crosse","Kahala","Todt Hill","Natomas","West Palm Beach","Pasadena",
            "Seekonk","San Jos","Grubbs","Annandale","Lamarville","Stella","Euclid","Crichton","Toledo","Long Beach","Horseshoe","Haverhill",
            "Hilton Village","West Haven","Dakar","Brownsville","Fort Collins","Layton","South Santa Rosa","Tustin","Hammond","San Angelo",
            "Georgetown","Igo","Aurora","San Jose","Glendale","Doney Park","Southfield","Plymouth","Pawtucket"};
    public static String getNome(){
        Random r= new Random();
        String [] pool=new String[]{"Willie", "Georgianna", "Naoma", "Maggie", "Reynaldo", "Madge", "Aide", "Lynelle", "Edwina", "Bree", "Natalia",
                "Johna", "Kesha", "Andres", "Joline", "Rebbecca", "Wai", "Lewis", "Sudie", "Carter", "Loma", "Jed", "Myesha", "Nola", "Cassidy", "Shin", "Farah",
                "Kristie", "Lakia", "Alla", "Christel", "Audra", "Luigi", "Ok", "Inell", "Mariela", "Trena", "Devorah", "Jennell", "Milly", "Danielle",
                "Edelmira", "Isabelle", "Jada", "Jose", "Lucilla", "Lashawn", "Shawnee", "Santina", "Dixie", "Leia", "Ty", "Casimira", "Eliz", "Reuben",
                "Zella", "Sade", "Soraya", "Chana", "Rhona", "Tisa", "Elna", "Sheena", "Alva", "Wilson", "Ilda", "Debbra", "Mavis", "Vanesa", "Nanette",
                "Nola", "Maryln", "Vinnie", "Collen", "Keneth", "Zackary", "Dorthy", "Tyler", "Janet", "Azzie", "Trudie", "Charis", "Leisha", "Miriam",
                "Stepanie", "Piper", "Sharyl", "Annmarie", "Rosalina", "Alexandra", "Rebekah", "Laquita", "Luciano", "Lorita", "Humberto", "Retha",
                "Ashanti", "Nicki", "Malorie", "Carlene"};;
        return pool[r.nextInt(pool.length)];
    }

    public static String getCognome(){
        Random r= new Random();
        String[] pool = {"Dellucci", "Fanucci", "Chiellini", "Alessi", "Oscuro", "Zullo", "Pirozzi", "Brichese", "Padovesi", "Paccioretti", "Gallo",
                "Pisano", "Jilani", "Bonucci", "Siciliani", "Montalto", "Palerma", "Allessi", "Apollone", "Sabbatini", "Candreva", "Rossi    ", "Russo", "Ferrari    ",
                "Esposito", "Bianchi    ", "Romano", "Colombo", "Ricci", "Marino", "Greco", "Bruno", "Gallo", "Conti", "De Luca", "Mancini",
                "Costa    ", "Giordano", "Rizzo    ", "Lombardi", "Moretti    ", "Barbieri", "Fontana", "Santoro", "Mariani", "Rinaldi", "Caruso", "Ferrara", "Galli",
                "Martini", "Leone", "Longo", "Gentile", "Martinelli", "Vitale", "Lombardo    ", "Serra", "Coppola", "De Santis", "D'angelo", "Marchetti", "Parisi", "Villa", "Conte",
                "Ferraro", "Ferri", "Fabbri", "Bianco", "Marini", "Grasso", "Valentini", "Messina", "Sala", "De Angelis", "Gatti", "Pellegrini", "Palumbo", "Sanna",
                "Farina    ", "Rizzi", "Monti", "Cattaneo", "Morelli", "Amato", "Silvestri", "Mazza", "Testa", "Grassi", "Pellegrino    ", "Carbone", "Giuliani"
                , "Benedetti", "Baron", "Rossetti", "Caputo    ", "Montanar", "Guerra", "Palmieri", "Bernardi", "Martino", "Fiore", "De Rosa",
                "Ferretti", "Bellini    ", "Basile", "Riva", "Donati", "Piras", "Vitali", "Battaglia", "Sartori", "Neri", "Costantini", "Milani",
                "Pagano", "Ruggiero", "Sorrentino", "D'amico", "Orlando", "Damico", "Negri"};
        return pool[r.nextInt(pool.length)];
    }

    public static String getTelefono(){
        String [] poolPrefissi=new String[]{"+02","+33","+34"};
        String numero="";
        for (int i = 0; i <8; i++) {
            numero+=r.nextInt(10);
        }
        return poolPrefissi[r.nextInt(poolPrefissi.length)]+numero;
    }

    public static String getCAP(){
        String numero="";
        for (int i = 0; i <5; i++) {
            numero+=r.nextInt(10);
        }
        return numero;
    }
    public static String getEmail(String nome,String cognome){
        String [] pool=new String []{"@gmail.com","@hotmail.it","@libero.it","@yahoo.it","@virgilio.it","@nextre.it"};
        String appo="._-";
        return (nome+(r.nextBoolean()?appo.charAt(r.nextInt(appo.length())):"")+cognome+(r.nextBoolean()?r.nextInt(100):"")+pool[r.nextInt(pool.length)]).toLowerCase();
    }

    public static String getPassword(){
        return getPassword(8);
    }

    public static String getPassword(int lunghezza){
        /*if(lunghezza<=0)
            throw new IllegalParamsException("Lunghezza minima un carattere");*/
        String chars = lettereNumeri+CaratteriSpeciali;
        String tmp="";
        while(tmp.length()<lunghezza){
            tmp+=chars.charAt(r.nextInt(chars.length()));
        }
        return tmp;
    }

    public static String getPin(int lunghezza){
        String tmp="";
        while(tmp.length()<lunghezza){
            tmp+=r.nextInt(10);
        }
        return tmp;
    }
    public static String getCartaDiCredito(int lunghezza){
        String tmp="";
        while(tmp.length()<lunghezza){
            tmp+=r.nextInt(10);
        }
        return tmp;
    }
    public static int getEta(int min, int max){
        return min+r.nextInt(max-min);
    }
    public static int getEta(){
        return r.nextInt(110)+1;
    }
    public static String getCitta(){
        return citta[r.nextInt(citta.length)];
    }
    public static double doubleRandom(double max, double min){
        return r.nextDouble()*(max-min)+min;
    }
    public static double doubleRandom(){
        return r.nextDouble();
    }


}//end class
