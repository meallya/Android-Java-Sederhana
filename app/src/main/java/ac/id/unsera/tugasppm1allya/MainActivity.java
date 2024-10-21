package ac.id.unsera.tugasppm1allya;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Memuat HomeFragment saat aplikasi dimulai
        if (savedInstanceState == null) {
            loadFragment(new HomeFragment());
        }
    }

    private void loadFragment(Fragment fragment) {
        // Mengganti fragment di MainActivity
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null); // Menambahkan fragment ke back stack
        transaction.commit();
    }

    // Metode untuk membuka ProductDetailFragment
    public void openProductDetail(String name, String price) {
        ProductDetailFragment productDetailFragment = new ProductDetailFragment();
        Bundle args = new Bundle();
        args.putString("name", name);
        args.putString("price", price);
        productDetailFragment.setArguments(args);
        loadFragment(productDetailFragment);
    }
}
