public abstract class Personne {
        protected String nom;
        protected String prenom;
        protected String email;
        protected int age;
        protected int tel;

        public Personne(String nom, String prenom, String email, int age, int tel) {
            this.nom = nom;
            this.prenom = prenom;
            this.email = email;
            this.age = age;
            this.tel = tel;
        }

        @Override
        public String toString() {
            return "Personne{" +
                    "nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", email='" + email + '\'' +
                    ", age=" + age +
                    ", tel=" + tel +
                    '}';
        }


    }

