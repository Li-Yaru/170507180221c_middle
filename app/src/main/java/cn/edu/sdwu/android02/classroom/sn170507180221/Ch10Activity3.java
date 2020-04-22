package cn.edu.sdwu.android02.classroom.sn170507180221;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//子activity
public class Ch10Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch10_3);
    }
    public  void ok(View view){
        //2设置子activity返回值
        EditText editText=(EditText)findViewById(R.id.ch10_3_et);
        String content=editText.getText().toString();
        //
        Intent intent=new Intent();
        intent.putExtra("name",content);
        setResult(RESULT_OK);//设置返回值

        finish();//关闭窗口
    }
    public  void cancel(View view){
        setResult(RESULT_CANCELED);//取消
        finish();//关闭窗口
    }

}
