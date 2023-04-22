public class ToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        // Configuración del toolbar personalizado
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Habilitar el botón de retroceso en la barra de herramientas
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Configuración del título del toolbar
        getSupportActionBar().setTitle(getIntent().getStringExtra("title"));

        // Si se requiere un botón de búsqueda en la barra de herramientas
        if (getIntent().getBooleanExtra("search", false)) {
            toolbar.inflateMenu(R.menu.menu_toolbar_search);
            // Configuración de la lógica para el botón de búsqueda
            MenuItem searchItem = toolbar.getMenu().findItem(R.id.action_search);
            SearchView searchView = (SearchView) searchItem.getActionView();
            searchView.setQueryHint("Buscar...");
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    // Lógica para realizar la búsqueda
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    // Lógica para actualizar los resultados de la búsqueda mientras se escribe
                    return false;
                }
            });
        }
    }

    // Configuración de la lógica para el botón de retroceso
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

