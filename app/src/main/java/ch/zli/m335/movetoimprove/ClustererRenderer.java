package ch.zli.m335.movetoimprove;

import android.content.Context;
import android.widget.ImageView;

import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.google.maps.android.ui.IconGenerator;


public class ClustererRenderer extends DefaultClusterRenderer<Clustermarker> {

    private final IconGenerator iconGenerator;
    private final ImageView imageView;
    private final int markerWidth;
    private final int markerHeight;

    public ClustererRenderer(Context context, GoogleMap map, ClusterManager<Clustermarker> clusterManager, IconGenerator iconGenerator, ImageView imageView, int markerWidth, int markerHeight) {
        super(context, map, clusterManager);
        this.iconGenerator = iconGenerator;
        this.imageView = imageView;
        this.markerWidth = markerWidth;
        this.markerHeight = markerHeight;

        iconGenerator = new IconGenerator(context.getApplicationContext());
        imageView = new ImageView(context.getApplicationContext());
    }
}
