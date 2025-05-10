public class App {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.adicionarMusica(new Musica("FE!N", "Travis Scott feat. Playboi Carti", 178));
        playlist.adicionarMusica(new Musica("INDUSTRY BABY", "Lil Nas X feat. Jack Harlow", 212));
        playlist.adicionarMusica(new Musica("Butterfly Effect", "Travis Scott", 190));
        playlist.adicionarMusica(new Musica("MONTERO (Call Me By Your Name)", "Lil Nas X", 137));
        playlist.adicionarMusica(new Musica("Troca", "Jorge & Mateus", 215));
      

        System.out.println("PLAYLIST ATUAL: ");
        playlist.exibirOrdemNormal();

        System.out.println("BUSCANDO FE!N: ");
        playlist.buscarMusica("FE!N");

        System.out.println("AVANÇANDO MUSICA: ");
        playlist.avancar();

        System.out.println("RETROCEDENDO MUSICA: ");
        playlist.retroceder();

        System.out.println("REMOVENDO MONTERO (Call Me By Your Name)");
        playlist.removerPorTitulo("MONTERO (Call Me By Your Name)");

        System.out.println("BUSCANDO MONTERO (Call Me By Your Name)");
        playlist.buscarMusica("MONTERO (Call Me By Your Name)"); //PROF, FIZ ESSE APENAS PARA MOSTRAR QUE APARECE UMA MENSAGEM QUANDO A MUSICA NAO É ENCONTRADA E TBM PARA MOSTRAR QUE REALMENTE HOUVE A REMOÇÃO DESSA MUSICA


        System.out.println("PLAYLIST ATUAL EM ORDEM INVERSA: ");
        playlist.exibirOrdemInversa();
    }
}
