package ac.id.unsera.tugasppm1allya;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ProductDetailFragment extends Fragment {
    private TextView productName, productPrice, productDescription;
    private Button buttonBuy;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_product_detail, container, false);

        productName = view.findViewById(R.id.productName);
        productPrice = view.findViewById(R.id.productPrice);
        productDescription = view.findViewById(R.id.productDescription);
        buttonBuy = view.findViewById(R.id.buttonBuy);

        // Dapatkan data produk dari argumen
        Bundle args = getArguments();
        if (args != null) {
            productName.setText(args.getString("name"));
            productPrice.setText(args.getString("price"));
            // Deskripsi produk dapat ditambahkan di sini
        }

        buttonBuy.setOnClickListener(v -> {
            // Logika untuk membeli produk
        });

        return view;
    }
}