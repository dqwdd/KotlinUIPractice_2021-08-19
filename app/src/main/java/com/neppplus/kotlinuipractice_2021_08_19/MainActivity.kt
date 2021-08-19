package com.neppplus.kotlinuipractice_2021_08_19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        toastBtn.setOnClickListener {

//            입력한 메시지가 뭔지 변수에 저장
//            messageEdt의 text속성에 담겨있는 값을 => inputMessage 변수에 담자~~
            val inputMessage = messageEdt.text.toString()

//            토스트로 inputMEssage를 띄워주자
            Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()

        }

    }
}