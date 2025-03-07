import java.util.Arrays;
import java.util.ArrayList;

public class Playlist {
    String [] favoriteSongs = new String[10];

    ArrayList<String> desertIslandPlaylista = new ArrayList<>();
    public Playlist() {
        favoriteSongs [0]="Diomedes Díaz - Martir";
        favoriteSongs [1]="Uriel Henao - Como nos cambia la vida ";
        favoriteSongs [2]="Omar Geles - Hoja en blanco";
        favoriteSongs [3]="Diomedes Diaz - Manguito biche ";
        favoriteSongs [4]="Thony Zambrano - El aventurero";
        favoriteSongs [5]="Anuel - pin";
        favoriteSongs [6]="Alzate - Ya no estoy a tus pies";
        favoriteSongs [7]="Martin Elias - Mi ex";
        favoriteSongs [8]="Anuel - 1942";
        favoriteSongs [9]="Los Diablitos - Historia ";


        desertIslandPlaylista.add("Anuel - Kei");
        desertIslandPlaylista.add("Fernando Burbano - Ahora Que Puedo");
        desertIslandPlaylista.add("Michel - Mujer De Cabaret");
        desertIslandPlaylista.add("Fernando Burbano - El Principe");
        desertIslandPlaylista.add("Afinaito - Maicol El Trequeto");

        desertIslandPlaylista.addAll(Arrays.asList(favoriteSongs));
        desertIslandPlaylista.remove(1);
        desertIslandPlaylista.remove(2);
        desertIslandPlaylista.remove(3);
        desertIslandPlaylista.remove(4);
        desertIslandPlaylista.remove(5);
        desertIslandPlaylista.remove("Afinaito - Maicol El Trequeto");
        desertIslandPlaylista.remove("Anuel - Kei");

        int  songA = desertIslandPlaylista.indexOf("Michel - Mujer De Cabaret");
        int  songB = desertIslandPlaylista.indexOf("Uriel Henao - Como nos cambia la vida ");

        String tempA = desertIslandPlaylista.get(songA);
        desertIslandPlaylista.set(songA, desertIslandPlaylista.get(songB));
        desertIslandPlaylista.set(songB, tempA);




    }

    public void playSong() {
        System.out.println("First three songs of the favorite playlist ");
        System.out.println("\t-" + favoriteSongs [0]);
        System.out.println("\t-" + favoriteSongs [1]);
        System.out.println("\t-" + favoriteSongs [2]);
        System.out.println("Songs for a desert island...");
        System.out.println( desertIslandPlaylista);
        System.out.println(desertIslandPlaylista.size());



    }
}
