public class Echo
{
    public static void main(String[] args)
   {
      SoundClip clip = new SoundClip();
      clip.pick();
      clip.show();    

      int[] samples = clip.getSampleValues();

      for (int i = 200; i < samples.length; i++)
      {
         samples[i] += samples[i - 200];
         if (samples[i] > 32767)
         {
             samples[i] = 32767;
         }
      }
      
      clip.show();
   }
}