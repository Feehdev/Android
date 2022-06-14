package com.brazillianbrains.lojanovapinheiros.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.brazillianbrains.lojanovapinheiros.R;
import com.brazillianbrains.lojanovapinheiros.model.ProductCategory;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {;
    Context context;
            List<ProductCategory> productCategoryList;


    public ProductAdapter(Context context, List<ProductCategory> productCategoryList) {
        this.context = context;
        this.productCategoryList = productCategoryList;
    }

    @NonNull
    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {;

        View view = LayoutInflater.from(context).inflate(R.layout.product_row_item, parent, false);
        return new ProductViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {;

        holder.categoryName.setText(productCategoryList.get(position).getProductname());
        holder.itemView.setOnClickListener(new onClickListener {

        }
                );

    }

    }

    @Override
    public int getItemCount() {
        return productCategoryList.size();
    }

public static final class ProductViewHolder extends RecyclerView.ViewHolder{

        TextView categoryName;

           public ProductViewHolder(@NonNull View itemView) { super(itemView); {
               super(itemView);

               categoryName = itemView.findViewById(R.id.cat_name)



           }

       }

}

