package com.atay.kg.neobis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import com.atay.kg.neobis.db.NotesD;
import com.atay.kg.neobis.db.NotesDB;
import com.atay.kg.neobis.models.Note;

import java.util.Date;

public class EditeNoteActivity extends AppCompatActivity {
    private EditText inputNote;
    private NotesD dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edite_note);
        inputNote = findViewById(R.id.input_note);
        NotesDB.getInstance(this).notesDao();
    }

    @Override
    public  boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.edite_task_menu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public  boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.save_task)
            onSaveNote();
        return super.onOptionsItemSelected(item);
    }

    private void onSaveNote() {
        String text = inputNote.getText().toString();
        if(!text.isEmpty())   {
            long date = new Date().getTime();
            Note note = new Note(text, date);
            dao.insertNote(note);

            finish();
        }

    }
}
