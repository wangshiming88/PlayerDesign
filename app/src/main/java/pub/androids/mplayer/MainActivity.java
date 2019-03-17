package pub.androids.mplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pub.androids.mplayer.impls.PlayerFactory;
import pub.androids.mplayer.interfaces.PlayInterface;
import pub.androids.mplayer.impls.MediaPlayer;

/**
 * 播放器的架构设计，2016年一个播控的项目抽取代码
 * 此接口是以MediaPlayer为原型设计的接口
 * 用MediaPlayer提供一个实现类
 *
 * @see MediaPlayer
 * 第三方的播放器就不列出来了
 * 实际项目中会根据项目，客户的名称进行修改
 * * 比如公司叫ZZ, 习惯改成ZZPlayer,项目使用PlayInterface player=new ZZPlayer()
 */
public class MainActivity extends AppCompatActivity {
    protected PlayInterface mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = PlayerFactory.getInstance(MainActivity.this).getMediaPlayerPlayer();
    }
}
