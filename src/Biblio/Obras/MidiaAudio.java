package Biblio.Obras;

public class MidiaAudio {
   private String audioBook;


   public MidiaAudio(){

   }

    public MidiaAudio(String audioBook) {
        this.audioBook = audioBook;
    }

    public String getAudioBook() {
        return audioBook;
    }

    public void setAudioBook(String audioBook) {
        this.audioBook = audioBook;
    }



    @Override
    public String toString() {
        return     audioBook + '\''
                ;
    }
}

