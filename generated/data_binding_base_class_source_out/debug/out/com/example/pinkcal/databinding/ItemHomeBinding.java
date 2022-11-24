// Generated by view binder compiler. Do not edit!
package com.example.pinkcal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.pinkcal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemHomeBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView txtday;

  @NonNull
  public final TextView txtdescription;

  private ItemHomeBinding(@NonNull CardView rootView, @NonNull TextView txtday,
      @NonNull TextView txtdescription) {
    this.rootView = rootView;
    this.txtday = txtday;
    this.txtdescription = txtdescription;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.txtday;
      TextView txtday = ViewBindings.findChildViewById(rootView, id);
      if (txtday == null) {
        break missingId;
      }

      id = R.id.txtdescription;
      TextView txtdescription = ViewBindings.findChildViewById(rootView, id);
      if (txtdescription == null) {
        break missingId;
      }

      return new ItemHomeBinding((CardView) rootView, txtday, txtdescription);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
