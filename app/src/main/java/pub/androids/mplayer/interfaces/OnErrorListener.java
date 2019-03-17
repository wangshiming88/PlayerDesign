package pub.androids.mplayer.interfaces;
import android.media.MediaPlayer;
public interface OnErrorListener {
        /**
         * @param mp
         * @param what
         * @param extra
         * @return
         * @see MediaPlayer.OnErrorListener#onError(MediaPlayer, int, int)
         */
        boolean onError(PlayInterface mp, int what, int extra);
    }
