List<String> paises3 = new ArrayList<String>();
        paises3.addAll(paises);
        paises3.addAll(paises2);

        Collections.sort(paises3);

        System.out.println("Lista ordenada:");
        showList(paises3);

    }
        public static void showList(List paises3) {
        int size = paises3.size();
        for(int i=0; i<size; i++){
            System.out.println(paises3.get(i));
        }
    }
}