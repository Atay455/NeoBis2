package com.atay.kg.neobis;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class TaskListFragment extends Fragment {
    private String noteText;
    private long noteDates;

    public TaskListFragment() {
        // Required empty public constructor
            this.noteText = noteText;
            this.noteDates = noteDates;

        }


        public String getNoteText () {
            return noteText;
        }

        public void setNoteText (String noteText){
            this.noteText = noteText;

        }

        public long getNoteDates () {
            return noteDates;
        }

        public void setNoteDates (long noteDates){
            this.noteDates = noteDates;
        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_task_list, container, false);
    }

}