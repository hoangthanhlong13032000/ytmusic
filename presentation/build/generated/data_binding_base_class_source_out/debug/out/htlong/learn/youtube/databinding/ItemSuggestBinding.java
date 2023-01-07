// Generated by view binder compiler. Do not edit!
package htlong.learn.youtube.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import htlong.learn.youtube.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemSuggestBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final ImageButton btnEnd;

  @NonNull
  public final TextView txtSuggest;

  private ItemSuggestBinding(@NonNull View rootView, @NonNull ImageButton btnEnd,
      @NonNull TextView txtSuggest) {
    this.rootView = rootView;
    this.btnEnd = btnEnd;
    this.txtSuggest = txtSuggest;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSuggestBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.item_suggest, parent);
    return bind(parent);
  }

  @NonNull
  public static ItemSuggestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_end;
      ImageButton btnEnd = ViewBindings.findChildViewById(rootView, id);
      if (btnEnd == null) {
        break missingId;
      }

      id = R.id.txt_suggest;
      TextView txtSuggest = ViewBindings.findChildViewById(rootView, id);
      if (txtSuggest == null) {
        break missingId;
      }

      return new ItemSuggestBinding(rootView, btnEnd, txtSuggest);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}