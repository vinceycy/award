package com.ineedit.award;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button result;
    private Button next;

    private AlertDialog.Builder nextDialog;
    private AlertDialog.Builder resultDialog;

    private View.OnClickListener resultListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // TODO 結算所有結果，並顯示所有人的結果額，使用dialog
            resultDialog.show();

            Log.i("test","resultListener");
        }
    };

    private View.OnClickListener nextListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // TODO 彈出確定進入下一局的詢問視窗，並在確定後清空舊資訊，開出新局
            nextDialog.show();

            Log.i("test","nextListener");
        }
    };

    private DialogInterface.OnClickListener resultConfirmListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            // TODO 確認結算結果
        }
    };

    private DialogInterface.OnClickListener nextConfirmListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            // TODO 確定清除資訊並開新一局
        }
    };

    private DialogInterface.OnClickListener nextCancelListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            // TODO 取消進入下一局
        }
    };

    private void setupUnit() {
        this.result = findViewById(R.id.result);
        this.result.setOnClickListener(this.resultListener);

        this.next = findViewById(R.id.next);
        this.next.setOnClickListener(this.nextListener);

        this.nextDialog = new AlertDialog.Builder(this);
        this.nextDialog.setTitle("確定要進入下一局？");
        this.nextDialog.setPositiveButton("進入下一局", this.nextConfirmListener);
        this.nextDialog.setNegativeButton("取消", this.nextCancelListener);

        this.resultDialog = new AlertDialog.Builder(this);
        this.resultDialog.setTitle("結算結果");
        this.resultDialog.setPositiveButton("確認", resultConfirmListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUnit();

        Log.i("test","SetupUnit");
    }
}
