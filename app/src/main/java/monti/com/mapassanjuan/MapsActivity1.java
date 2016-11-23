package monti.com.mapassanjuan;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity1 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private String lugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps1);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        Bundle param = getIntent().getExtras();
        lugar = param.getString("lugar");
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
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
        LatLng sitio = new LatLng(-30.1253080676215, -67.86995189999999);

        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //LatLng calingasta = new LatLng(-31.33437470778376, -69.41909657266774);
        switch (lugar){
            case("ischigualasto"):
                sitio = new LatLng(-30.1253080676215, -67.86995189999999);
                mMap.addMarker(new MarkerOptions().position(sitio).title("Ischigualasto"));
                break;
            case("leoncito"):
                sitio = new LatLng(-31.797415309845224, -69.37395100000003);
                mMap.addMarker(new MarkerOptions().position(sitio).title("Pampa del Leoncito"));
                break;
            case("vallefertil"):
                sitio = new LatLng(-30.593404934962372, -67.70740009999997);
                mMap.addMarker(new MarkerOptions().position(sitio).title("Valle Fertil"));
                break;
            case("ullum"):
                sitio = new LatLng(-31.487553699165552, -68.68873754145511);
                mMap.addMarker(new MarkerOptions().position(sitio).title("Dique Ullum"));
                break;
        }
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sitio));
    }
}
