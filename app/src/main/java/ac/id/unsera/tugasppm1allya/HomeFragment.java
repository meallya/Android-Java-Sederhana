package ac.id.unsera.tugasppm1allya;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private ArrayList<Product> productList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        productList = new ArrayList<>();
        loadProducts();

        // Set layout manager di sini
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        productAdapter = new ProductAdapter(productList, getActivity());
        recyclerView.setAdapter(productAdapter);

        return view;
    }

    private void loadProducts() {
        productList.add(new Product("Moisturizer", "$20"));
        productList.add(new Product("Sunscreen", "$15"));
        productList.add(new Product("Facial Cleanser", "$10"));
        productList.add(new Product("Toner", "$12"));
        productList.add(new Product("Serum", "$25"));
        // Tambahkan produk lainnya sesuai kebutuhan...
    }
}
