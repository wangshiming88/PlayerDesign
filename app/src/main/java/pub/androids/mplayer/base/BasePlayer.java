package pub.androids.mplayer.base;

import pub.androids.mplayer.interfaces.OnBufferingUpdateListener;
import pub.androids.mplayer.interfaces.OnErrorListener;
import pub.androids.mplayer.interfaces.OnInfoListener;
import pub.androids.mplayer.interfaces.OnPauseListener;
import pub.androids.mplayer.interfaces.OnPreparedListener;
import pub.androids.mplayer.interfaces.OnSeekCompleteListener;
import pub.androids.mplayer.interfaces.OnVideoSizeChangedListener;
import pub.androids.mplayer.interfaces.PlayInterface;

public abstract class BasePlayer implements PlayInterface {

    protected OnPauseListener OnPauseListener;
    protected OnPreparedListener onPreparedListener;
    protected OnCompletionListener onCompletionListener;
    protected OnVideoSizeChangedListener onVideoSizeChangedListener;
    protected OnBufferingUpdateListener onBufferingUpdateListener;
    protected OnSeekCompleteListener onSeekCompleteListener;
    protected OnErrorListener onErrorListener;
    protected OnInfoListener onInfoListener;

    @Override
    public void setOnPreparedListener(OnPreparedListener listener) {
        this.onPreparedListener = listener;
    }

    @Override
    public void setOnCompletionListener(OnCompletionListener listener) {
        this.onCompletionListener = listener;
    }

    @Override
    public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener listener) {
        this.onVideoSizeChangedListener = listener;
    }

    @Override
    public void setOnBufferingUpdateListener(OnBufferingUpdateListener listener) {
        this.onBufferingUpdateListener = listener;
    }

    @Override
    public void setOnSeekCompleteListener(OnSeekCompleteListener listener) {
        this.onSeekCompleteListener = listener;
    }

    @Override
    public void setOnErrorListener(OnErrorListener listener) {
        this.onErrorListener = listener;
    }

    @Override
    public void setOnInfoListener(OnInfoListener listener) {
        this.onInfoListener = listener;
    }

    @Override
    public void setOnPauseListener(OnPauseListener listener) {
        this.OnPauseListener = listener;
    }
}
