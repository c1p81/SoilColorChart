package com.geo.munsell;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class grid1 extends Activity {

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid1);
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
               	String colore="";
        		String descrizione="";
        		
        		switch (position){
            	case 0:
            		colore = "5R 8/2";
            		descrizione = "Grayish Pink";
            		break;
              	case 1:
              		colore = "5R 7/4";
              		descrizione = "Moderate Pink";
              		break;
              	case 2:
              		colore = "5R 6/2";
              		descrizione = "Pale Red";
              		break;
              	case 3:
              		colore = "5R 6/6";
              		descrizione = "Light Red";
              		break;
              	case 4:
              		colore = "5R 5/4";
              		descrizione = "Moderate Red";
              		break;
              	case 5:
              		colore = "5R 4/2";
              		descrizione = "Grayish Red";
              		break;
              	case 6:
              		colore = "5R 4/6";
              		descrizione = "Moderate Red";
              		break;
              	case 7:
              		colore = "5R 3/4";
              		descrizione = "Dusky Red";
              		break;
              	case 8:
              		colore = "5R 2/2";
              		descrizione = "Blackish Red";
              		break;
              	case 9:
              		colore = "5R 2/6";
              		descrizione = "Very Dark Red";
              		break;
              	case 10:
              		colore = "10R 8/2";
              		descrizione = "Grayish Orange Pink";
              		break;
              	case 11:
              		colore = "10R 7/4";
              		descrizione = "Moderate Orange Pink";
              		break;
              	case 12:
              		colore = "10R 6/2";
              		descrizione = "Pale Red";
              		break;
              	case 13:
              		colore = "10R 6/6";
              		descrizione = "Moderate Reddish Orange";
              		break;
              	case 14:
              		colore = "10R 5/4";
              		descrizione = "Pale Reddish Brown";
              		break;
              	case 15:
              		colore = "10R 4/2";
              		descrizione = "Grayish Red";
              		break;
              	case 16:
              		colore = "10R 4/6";
              		descrizione = "Modderate Reddish Brown";
              		break;
              	case 17:
              		colore = "10R 4/3";
              		descrizione = "Dark Reddish Brown";
              		break;
              	case 18:
              		colore = "10R 2/2";
              		descrizione = "Very Dusky Red";
              		break;
              	case 19:
              		colore = "5Y 8/4";
              		descrizione = "Pale Red";
              		break;
              	case 20:
              		colore = "5YR 7/2";
              		descrizione = "Grayish Orange Pink";
              		break;
              	case 21:
              		colore = "5YR 6/4";
              		descrizione = "Light Brown";
              		break;
              	case 22:
              		colore = "5YR 5/2";
              		descrizione = "Pale Brown";
              		break;
              	case 23:
              		colore = "5YR 5/6";
              		descrizione = "Light Brown";
              		break;
              	case 24:
              		colore = "5YR 4/4";
              		descrizione = "Moderate Brown";
              		break;
              	case 25:
              		colore = "5Y 3/2";
              		descrizione = "Grayish Brown";
              		break;
              	case 26:
              		colore = "5YR 3/4";
              		descrizione = "Moderate Brown";
              		break;
              	case 27:
              		colore = "5YR 2/2";
              		descrizione = "Dusky Brown";
              		break;
              	case 28:
              		colore = "10YR 8/2";
              		descrizione = "Very Pale Orange";
              		break;
              	case 29:
              		colore = "10YR 8/6";
              		descrizione = "Pale Yellowish Orange";
              		break;
             
            	case 30:
              		colore = "10YR 7/4";
              		descrizione = "Grayish Orange";
              		break;
              	case 31:
              		colore = "10YR 6/2";
              		descrizione = "Pale Yellowish Brown";
              		break;
              	case 32:
              		colore = "10YR 6/6";
              		descrizione = "Dark Yellowish Orange";
              		break;
              	case 33:
              		colore = "10YR 5/4";
              		descrizione = "Moderate Yellowish Brown";
              		break;
              	case 34:
              		colore = "10YR 4/2";
              		descrizione = "Dark Yellowish Brown";
              		break;
              	case 35:
              		colore = "10YR 2/2";
              		descrizione = "Dusky Yellowish Brown";
              		break;
              	case 36:
              		colore = "5Y 8/4";
              		descrizione = "Graysh Yellow";
              		break;
              	case 37:
              		colore = "5Y 7/2";
              		descrizione = "Yellowish Gray";
              		break;
              	case 38:
              		colore = "5Y 7/6";
              		descrizione = "Moderate Yellow";
              		break;
              	case 39:
              		colore = "5Y 6/4";
              		descrizione = "Dusky Yellow";
              		break;         		
              	case 40:
              		colore = "5Y 5/2";
              		descrizione = "Light Olive Gray";
              		break;         		
              	case 41:
              		colore = "5Y 5/6";
              		descrizione = "Light Olive Brown";
              		break;         		
              		
              	case 42:
              		colore = "5Y 4/4";
              		descrizione = "Moderate Olive Brown";
              		break;
              	case 43:
              		colore = "5Y 3/2";
              		descrizione = "Olive Gray";
              		break;
              	case 44:
              		colore = "10Y 8/2";
              		descrizione = "Pale Greenish Yellow";
              		break;
              	case 45:
              		colore = "10Y 7/4";
              		descrizione = "Moderate Greenish Yellow";
              		break;
              	case 46:
              		colore = "10Y 6/2";
              		descrizione = "Pale Olive";
              		break;
              	case 47:
              		colore = "10Y 6/6";
              		descrizione = "Dark Greenish Yellow";
              		break;
              	case 48:
              		colore = "10Y 5/4";
              		descrizione = "Light Olive";
              		break;
              	case 49:
              		colore = "10Y 4/2";
              		descrizione = "Grayish Olive";
              		break;         		
              	case 50:
              		colore = "5GY 7/2";
              		descrizione = "Grayish Yellow Green";
              		break;         		
              	case 51:
              		colore = "5GY 7/4";
              		descrizione = "Moderate Yellow Green";
              		break;         		
              	case 52:
              		colore = "5GY 5/2";
              		descrizione = "Dusky Yellow Green";
              		break;
              	case 53:
              		colore = "5GY 3/2";
              		descrizione = "Grayish Olive Green";
              		break;
              	case 54:
              		colore = "10GY 7/2";
              		descrizione = "Pale Yellowish Green";
              		break;
              	case 55:
              		colore = "10GY 6/4";
              		descrizione = "Moderate Yellowish Green";
              		break;
              	case 56:
              		colore = "10GY 5/2";
              		descrizione = "Grayish Green";
              		break;
              	case 57:
              		colore = "10GY 4/4";
              		descrizione = "Dark Yellowish Green";
              		break;
              	case 58:
              		colore = "10GY 3/2";
              		descrizione = "Dusky Yellowish Green";
              		break;
              	case 59:
              		colore = "5G 7/2";
              		descrizione = "Pale Green";
              		break;
              	case 60:
              		colore = "5G 7/4";
              		descrizione = "Light Green";
              		break;         		
              	case 61:
              		colore = "5G 6/6";
              		descrizione = "Brilliant Green";
              		break;
              	case 62:
              		colore = "5G 5/2";
              		descrizione = "Moderate Yellow Green";
              		break;
              	case 63:
              		colore = "5G 5/6";
              		descrizione = "Moderate Green";
              		break;
              	case 64:
              		colore = "5G 3/2";
              		descrizione = "Dusky Green";
              		break;
              	case 65:
              		colore = "10G 8/2";
              		descrizione = "Very Pale Green";
              		break;
              	case 66:
              		colore = "10G 6/2";
              		descrizione = "Pale Green";
              		break;
              	case 67:
              		colore = "10G 4/2";
              		descrizione = "Grayish Green";
              		break;
              	case 68:
              		colore = "5BG 7/2";
              		descrizione = "Pale Blue Green";
              		break;
              	case 69:
              		colore = "5BG 6/6";
              		descrizione = "Light Blue Green";
              		break;
              	case 70:
              		colore = "5BG 5/2";
              		descrizione = "Grayish Blue Green";
              		break;         		
              	case 71:
              		colore = "5BG 4/6";
              		descrizione = "Moderate Blue Green";
              		break;         		
              	case 72:
              		colore = "5BG 3/2";
              		descrizione = "Dusky Blue Green";
              		break;
              	case 73:
              		colore = "5B 8/2";
              		descrizione = "Very Pale Blue";
              		break;
              	case 74:
              		colore = "5B 7/6";
              		descrizione = "Light Blue";
              		break;
              	case 75:
              		colore = "5B 6/2";
              		descrizione = "Pale Blue";
              		break;
              	case 76:
              		colore = "5B 5/6";
              		descrizione = "Moderate Blue";
              		break;
              	case 77:
              		colore = "5PB 7/2";
              		descrizione = "Pale Blue";
              		break;
              	case 78:
              		colore = "5PB 5/2";
              		descrizione = "Grayish Blue";
              		break;
              	case 79:
              		colore = "5PB 3/2";
              		descrizione = "Dusky Blue";
              		break;
              	case 80:
              		colore = "5P 6/2";
              		descrizione = "Pale Purple";
              		break;         		
              	case 81:
              		colore = "5P 4/2";
              		descrizione = "Grayish Purple";
              		break;         		
              	case 82:
              		colore = "5P 2/2";
              		descrizione = "Very Dusky Purple";
              		break;
              	case 83:
              		colore = "5RP 8/2";
              		descrizione = "Pale Pink";
              		break;
              	case 84:
              		colore = "5RP 6/2";
              		descrizione = "Pale Red Purple";
              		break;
              	case 85:
              		colore = "5RP 4/2";
              		descrizione = "Grayish Red Purple";
              		break;
              	case 86:
              		colore = "5RP 2/2";
              		descrizione = "Moderate Blue";
              		break;
              	case 87:
              		colore = "5B 9/1";
              		descrizione = "Bluish White";
              		break;
              	case 88:
              		colore = "5G 8/1";
              		descrizione = "Light Greenish Gray";
              		break;
              	case 89:
              		colore = "5GY 3/1";
              		descrizione = "Light Greenish Gray";
              		break;
              	case 90:
              		colore = "5Y 8/1";
              		descrizione = "Yellowish Gray";
              		break;         		
              	case 91:
              		colore = "5YR 8/1";
              		descrizione = "Yellowish Gray";
              		break;         		
              	case 92:
              		colore = "5B 7/1";
              		descrizione = "Light Bluish Gray";
              		break;         		
              	case 93:
              		colore = "5YR 6/1";
              		descrizione = "Light Brownish Gray";
              		break;         		
              	case 94:
              		colore = "5Y 6/1";
              		descrizione = "light Olive Gray";
              		break;         		
              	case 95:
              		colore = "5G 6/1";
              		descrizione = "Greenish Gray";
              		break;         		
              	case 96:
              		colore = "5GY 6/1";
              		descrizione = "Greenish Gray";
              		break;         		
              	case 97:
              		colore = "5B 5/1";
              		descrizione = "Medium Bluish Gray";
              		break;         		
              	case 98:
              		colore = "5G 4/1";
              		descrizione = "Dark Greenish Gray";
              		break;         		
              	case 99:
              		colore = "5GY 4/1";
              		descrizione = "Dark Greenish Gray";
              		break;         		
              	case 100:
              		colore = "5Y 4/1";
              		descrizione = "Olive Gray";
              		break;         		

              	case 101:
              		colore = "5YR 4/1";
              		descrizione = "Brownish Gray";
              		break;         		
              	case 102:
              		colore = "5G 2/1";
              		descrizione = "Greenish Black";
              		break;         		
              	case 103:
              		colore = "5GY 2/1";
              		descrizione = "Greenish Black";
              		break;         		
              	case 104:
              		colore = "5Y 2/1";
              		descrizione = "Olive Black";
              		break;         		
              	case 105:
              		colore = "5YR 2/1";
              		descrizione = "Brownish Black";
              		break;         		
              	case 106:
              		colore = "N9";
              		descrizione = "White";
              		break;         		
              	case 107:
              		colore = "N8";
              		descrizione = "Very Light Gray";
              		break;         		
              	case 108:
              		colore = "N7";
              		descrizione = "Light Gray";
              		break;         		
              	case 109:
              		colore = "N6";
              		descrizione = "Medium Light Gray";
              		break;         		
              	case 110:
              		colore = "N5";
              		descrizione = "Medium Gray";
              		break;         		
              	case 111:
              		colore = "N4";
              		descrizione = "Medium Dark Gray";
              		break;         		
              	case 112:
              		colore = "N3";
              		descrizione = "Dark Gray";
              		break;         		
              	case 113:
              		colore = "N2";
              		descrizione = "Grayish Black";
              		break;         		
              	case 114:
              		colore = "N1";
              		descrizione = "Black";
              		break;         		              		
            	}
                Toast.makeText(grid1.this, colore+"\n" + descrizione, Toast.LENGTH_SHORT).show();
            }
        });
    }
 }



class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.a001a5r82,
            R.drawable.a002a5r74,
            R.drawable.a003a5r62,
            R.drawable.a004a5r66,
            R.drawable.a005a5r54,
            R.drawable.a006a5r42,
            R.drawable.a007a5r46,
            R.drawable.a008a5r34,
            R.drawable.a009a5r22,
            R.drawable.a010a5r26,
            R.drawable.a011a10r82,
            R.drawable.a012a10r74,
            R.drawable.a013a10r62,
            R.drawable.a014a10r66,
            R.drawable.a015a10r54,
            R.drawable.a016a10r42,
            R.drawable.a017a10r46,
            R.drawable.a018a10r34,
            R.drawable.a019a10r22,
            R.drawable.a020a5y84,
            R.drawable.a021a5yr72,
            R.drawable.a022a5yr64,
            R.drawable.a023a5yr52,
            R.drawable.a024a5yr56,
            R.drawable.a025a5yr44,
            R.drawable.a026a5y32,
            R.drawable.a027a5yr34,
            R.drawable.a028a5yr22,
            R.drawable.a029a10yr82,
            R.drawable.a030a10yr86,
            R.drawable.a031a10yr74,
            R.drawable.a032a10yr62,
            R.drawable.a033a10yr66,
            R.drawable.a034a10yr54,
            R.drawable.a035a10yr42,
            R.drawable.a036a10yr22,
            R.drawable.a037a5y84,
            R.drawable.a038a5y72,
            R.drawable.a039a5y76,
            R.drawable.a040a5y64,
            R.drawable.a041a5y52,
            R.drawable.a042a5y56,
            R.drawable.a043a5y44,
            R.drawable.a044a5y32,
            R.drawable.a045a10y82,
            R.drawable.a046a10y74,
            R.drawable.a047a10y62,
            R.drawable.a048a10y66,
            R.drawable.a049a10y54,
            R.drawable.a050a10y42,
            R.drawable.a051a5gy72,
            R.drawable.a052a5gy74,
            R.drawable.a053a5gy52,
            R.drawable.a054a5gy32,
            R.drawable.a055a10gy72,
            R.drawable.a056a10gy64,
            R.drawable.a057a10gy52,
            R.drawable.a058a10gy44,
            R.drawable.a059a10gy32,
            R.drawable.a060a5g72,
            R.drawable.a061a5g74,
            R.drawable.a062a5g66,
            R.drawable.a063a5g52,
            R.drawable.a064a5g56,
            R.drawable.a065a5g32,
            R.drawable.a066a10g82,
            R.drawable.a067a10g62,
            R.drawable.a068a10g42,
            R.drawable.a069a5bg72,
            R.drawable.a070a5bg66,
            R.drawable.a071a5bg52,
            R.drawable.a072a5bg46,
            R.drawable.a073a5bg32,
            R.drawable.a074a5b82,
            R.drawable.a075a5b76,
            R.drawable.a076a5b62,
            R.drawable.a077a5b56,
            R.drawable.a078a5pb72,
            R.drawable.a079a5pb52,
            R.drawable.a080a5pb32,
            R.drawable.a081a5p62,
            R.drawable.a082a5p42,
            R.drawable.a083a5p22,
            R.drawable.a084a5rp82,
            R.drawable.a085a5rp62,
            R.drawable.a086a5rp42,
            R.drawable.a087a5rp22,
            R.drawable.a088a5b91,
            R.drawable.a089a5g81,
            R.drawable.a090a5gy81,
            R.drawable.a091a5y81,
            R.drawable.a092a5yr81,
            R.drawable.a093a5b71,
            R.drawable.a094a5yr61,
            R.drawable.a095a5y61,
            R.drawable.a096a5g61,
            R.drawable.a097a5gy61,
            R.drawable.a098a5b51,
            R.drawable.a099a5g41,
            R.drawable.a100a5gy41,
            R.drawable.a101a5y41,
            R.drawable.a102a5yr41,
            R.drawable.a103a5g21,
            R.drawable.a104a5gy21,
            R.drawable.a105a5y21,
            R.drawable.a106a5yr21,
            R.drawable.a107an9,
            R.drawable.a108an8,
            R.drawable.a109an7,
            R.drawable.a110an6,
            R.drawable.a111an5,
            R.drawable.a112an4,
            R.drawable.a113an3,
            R.drawable.a114an2,
            R.drawable.a115an1
            
    };
}