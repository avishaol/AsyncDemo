package ness.tomerbu.edu.asyncdemo;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ProgressBar;

/**
 * Created by android on 16/06/2016.
 */
public class InternetTask extends AsyncTask<String, Integer, String> {

    private final ProgressBar bar;

    public InternetTask(Context context , ProgressBar bar) {
        this.context = context;
        this.bar = bar;
    }

    private Context context;

    @Override
    protected String doInBackground(String... params) {
        //
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        //UI
        super.onPostExecute(s);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        //UI
        bar.setProgress(values[0]);
        super.onProgressUpdate(values);
    }
}
