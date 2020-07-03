package ch.zli.m335.movetoimprove;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Location currentLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.google_map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng sydney = new LatLng(61, 105);
        mMap.addMarker(new MarkerOptions().position(sydney).title("First point"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        LatLng point1 = new LatLng(61.12, 105.2);
        mMap.addMarker(new MarkerOptions().position(point1).title("Second point"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(point1));

        LatLng point2 = new LatLng(60.86, 104.89);
        mMap.addMarker(new MarkerOptions().position(point2).title("Third point"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(point2));

        LatLng point3 = new LatLng(61.23, 104.99);
        mMap.addMarker(new MarkerOptions().position(point3).title("Fourth point"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(point3));

        LatLng point4 = new LatLng(60.88, 105.13);
        mMap.addMarker(new MarkerOptions().position(point4).title("Fifth point"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(point4));

        LatLng point5 = new LatLng(61.11, 105.3432);
        mMap.addMarker(new MarkerOptions().position(point5).title("Sixth point"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(point5));

        LatLng point6 = new LatLng(60.5, 105.321);
        mMap.addMarker(new MarkerOptions().position(point6).title("Seventh point"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(point6));
    }
}