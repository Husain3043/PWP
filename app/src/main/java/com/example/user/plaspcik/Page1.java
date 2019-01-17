package com.example.user.plaspcik;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Page1 extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);


        Button cam = (Button)findViewById(R.id.camera);
        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Page1.this,Upload.class);
                startActivity(intent);
            }
        });
    }

    //ehTHBSVo9IHstgctm7CKJgA- (Client Secret)
    //143624861542-t63jbmpo2skqasthti2js5jbe5pas0qn.apps.googleusercontent.com (Client ID)


    //@Override
    //protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    //  super.onActivityResult(requestCode, resultCode, data);
    //Bitmap bitmap = (Bitmap)data.getExtras().get("data");
    //imageView.setImageBitmap(bitmap);
    //}
}

