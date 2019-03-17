package pub.androids.mplayer;

import android.view.Surface;
import android.view.SurfaceHolder;

import pub.androids.mplayer.interfaces.OnBufferingUpdateListener;
import pub.androids.mplayer.interfaces.OnErrorListener;
import pub.androids.mplayer.interfaces.OnInfoListener;
import pub.androids.mplayer.interfaces.OnPauseListener;
import pub.androids.mplayer.interfaces.OnPreparedListener;
import pub.androids.mplayer.interfaces.OnSeekCompleteListener;
import pub.androids.mplayer.interfaces.OnVideoSizeChangedListener;
import pub.androids.mplayer.interfaces.PlayInterface;

/**
 * 播放器的代理类
 *
 */

public class PlayeProxy implements PlayInterface {

    /**
     * 真正的播放器
     */
    PlayInterface player;
    OnPauseListener listener;

    public static PlayInterface obaintPlayer(PlayInterface player) {
        return new PlayeProxy(player);
    }

    private PlayeProxy(PlayInterface player) {
        this.player = player;
    }


    @Override
    public void setSurface(Surface surface) {
        if (player != null) {
            player.setSurface(surface);
        }
    }

    @Override
    public void setDataSource(String url) throws Exception {
        if (player != null) {
            /**
             * 启动当前的播放器
             */
            player.setDataSource(url);
        }

    }

    @Override
    public void setAudioStreamType(int type) {
        if (player != null)
            player.setAudioStreamType(type);
    }

    @Override
    public void pause(boolean goback) {
        if (player != null) {
            player.pause(goback);
            if (listener != null)
                listener.onPaused();
        }
    }

    @Override
    public void setDisplay(SurfaceHolder holder) {
        if (player != null) {
            player.setDisplay(holder);
        }
    }

    @Override
    public void stop() {
        if (player != null)
            player.stop();
    }

    @Override
    public void release() {
        if (player != null) {
            player.release();
            player = null;
        }

    }

    @Override
    public void start() {
        if (player != null) {
            player.start();
        }
    }

    @Override
    public void prepareAsync() {
        if (player != null) {
            player.prepareAsync();
        }
    }

    @Override
    public void seekTo(int pos) {
        if (player != null)
            player.seekTo(pos);
    }

    @Override
    public int getVideoWidth() {
        if (player != null)
            return player.getVideoWidth();
        return 0;
    }

    @Override
    public int getVideoHeight() {
        if (player != null)
            return player.getVideoHeight();
        return 0;
    }

    @Override
    public int getCurrentPosition() {
        if (player != null)
            return player.getCurrentPosition();
        return 0;
    }

    @Override
    public int getDuration() {
        if (player != null)
            return player.getDuration();
        return 0;
    }

    @Override
    public boolean isPlaying() {
        if (player != null)
            return player.isPlaying();
        return false;
    }

    @Override
    public boolean isLooping() {
        if (player != null)
            return player.isLooping();
        return false;
    }

    @Override
    public void setOnPreparedListener(OnPreparedListener listener) {
        if (player != null) {
            player.setOnPreparedListener(listener);
        }
    }

    @Override
    public void setOnCompletionListener(OnCompletionListener listener) {
        if (player != null) {
            player.setOnCompletionListener(listener);
        }
    }

    @Override
    public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener listener) {
        if (player != null) {
            player.setOnVideoSizeChangedListener(listener);
        }
    }

    @Override
    public void setOnBufferingUpdateListener(OnBufferingUpdateListener listener) {
        if (player != null) {
            player.setOnBufferingUpdateListener(listener);
        }
    }

    @Override
    public void setOnSeekCompleteListener(OnSeekCompleteListener listener) {
        if (player != null) {
            player.setOnSeekCompleteListener(listener);
        }
    }

    @Override
    public void setOnErrorListener(OnErrorListener listener) {
        if (player != null) {
            player.setOnErrorListener(listener);
        }
    }

    @Override
    public void setOnInfoListener(OnInfoListener listener) {
        if (player != null) {
            player.setOnInfoListener(listener);
        }
    }

    @Override
    public void setOnPauseListener(OnPauseListener listener) {
        this.listener = listener;
    }


}