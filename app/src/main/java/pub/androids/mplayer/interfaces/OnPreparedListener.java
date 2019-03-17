package pub.androids.mplayer.interfaces;
import android.media.MediaPlayer;
/**
     * @see MediaPlayer.OnPreparedListener
     */
    public interface OnPreparedListener {
        /**
         * @param mp
         * @see MediaPlayer.OnPreparedListener#onPrepared(MediaPlayer)
         */
        void onPrepared(PlayInterface mp);
    }