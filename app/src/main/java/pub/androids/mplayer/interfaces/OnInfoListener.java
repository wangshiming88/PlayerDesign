package pub.androids.mplayer.interfaces;
import android.media.MediaPlayer;
/**
     * @see MediaPlayer.OnInfoListener
     */
    public interface OnInfoListener {
        /**
         * @param mp
         * @param what
         * @param extra
         * @return
         * @see MediaPlayer.OnInfoListener#onInfo(MediaPlayer, int, int)
         */
        boolean onInfo(PlayInterface mp, int what, int extra);
    }