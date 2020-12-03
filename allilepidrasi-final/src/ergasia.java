/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sefea
 */
import java.awt.event.*;
import java.awt.*;
import static java.awt.SystemColor.window;
import java.util.Arrays;
import java.util.Enumeration;
import javax.swing.*;

public class ergasia extends javax.swing.JFrame implements ActionListener{

    //STATHIS - ALKIS
       String[] questions={  
                             "10 Νησιώτικοι χοροί" ,
                             "10 Στρατηγοί στην αρχαία Ελλάδα", 
                               "10 Διοικητικές περιφέρειες της Ελλάδας",
                               "Οι 10 πιο βόρειοι (γεωγραφικά) νομοί της Ελλάδας",
                               "10 Πόλεις της Ελλάδας από “Α”",
                               "10 Πρωτεύοντα θηλαστικά",
                               "10 Είδη κιθάρας ",
                               "10 Λέξεις/Φράσεις σχετικά με τον Σωκράτη",
                               "10 Νησιά Βορειοανατολικού Αιγιου",
                               "10 Πόλεμοι μέσα στον 20ο αιώνα",
                               "10 Singles των Linkin Park",
                               "10 τραγούδια του Π.Σιδηρόπουλου	",
                               "10 Μηχανές αναζήτησης ",
                               "10 Λέξεις για το Μονακό",
                               "10 Αδένες του ανθρώπινου σώματος ",
                               " 10 Ιταλοί ζωγράφοι", 
                               "10 Όργανα του θώρακα και της κοιλιάς στον άνθρωπο",
                               "Οι πολυπληθέστερες πόλεις(πόλεις συγκροτήματα) της Ελλάδας",
                               "Οι 10 μεγαλύτερες πετρελαιοπαραγωγικές χώρες (2019)",
                               "10 Χώρες με τις περισσότερες νίκες στη Eurovision",
                               "10 Πρώην Σοσιαλιστικά/Κομμουνιστικά κράτη",
                               "10 Οστά",
                               "10 Πουλιά στην Ελλάδα",
                               "10 Χώρες με το ταχύτερο internet (2018)",
                               "10 Χώρες που έχουν για επίσημη γλώσσα την Ισπανική",
                               "10 Χώρες (σύγχρονες) που περιλάμβανε η Μογγολική Αυτοκρατορία",
                               "10 Χώρες και κρατίδια από “Ο”",
                               "10 Παραδοσιακοί Ελληνικοί χοροί",
                               "10 Πρωθυπουργοί της Ελλάδας μετά το 1974",
                               "10 Χώρες με τα πιο ισχυρά πυρηνικά εργοστάσια",
                               "10 Νομοί της Ελλάδας που δεν βρέχονται απο θαλασσα",
                               "10 Αρχαία Ελληνικά Αγάλματα ",
                               "10 Είδη γάλακτος",
                               "10 Είδη ψωμιού",
                               "10 Ταινίες που διαδραματίζονται στο διάστημα",
                               "10 Σώματα και Όπλα του Στρατού ξηράς",
                               "10 Λέξεις για τον βόλο",
                               "10 Ταινίες με την Julia Roberts ",
                               "10 Ταινίες με τον J.C. Van Damme",
                               "10 Παραλίες της Ρόδου",
                               "10 Λέξεις σχετικές με τη Σουηδία",
                               "10 Αρχαιολογικα ιστορικά μέρη της Πελοποννήσου",
                               "10 Βαθμοι της Ελληνικής Αστυνομίας",
                               "10 Είδη κρέμας",
                               "10 Λέξεις για τον Βασιλιά Των Λιονταριών",
                               "10 Ποικιλίες σταφυλιών (κρασιών)",
                               "10 Υλικά για σπανακόπιτα",
                               "10 Μέρη(περιοχές) για  διασκέδαση στη Θεσσαλονίκη",
                               "10 Λέξεις για  την αραβία",
                               };
        String[][] answers={ 
            { "Σούστα (4)","Πηδηχτός Ρόδου (5)","Μπαλαριστός Μυκόνου (5)","Ικαριώτικος (2)","Πεντοζάλι (2)","Κερκυραϊκος (2)","Μπάλλος (2)","Συρτός (2)","Χιώτικος (5)","Βλάχα Νάξου (3)"},
            { "Επαμεινώνδας (5)","Βρασίδας (5)","Θεμιστοκλής (3)","Αλκιβιάδης (4)","Μιλτιάδης (3)","Παυσανίας (4)","Φίλιππος Β (4)","Κίμωνας (5)","Λεωνίδας (1)","Μέγας Αλέξανδρος (1)"},
            { "Βόρειο Αιγαίο (3)","Νότιο Αιγαίο (4)","Ήπειρος (2)","Περιφέρεια Θεσσαλίας (2)","Κρήτη (1)","Πελοπόννησος (1)","Αττική (1)","Δυτική Μακεδονία (2)","Ανατολική Μακεδονία και Θράκη (2)","Στερεά Ελλάδα (1)"},
            { "Ροδόπης (3)","Έβρου (2)","Καβάλα (2)","Θεσσαλονίκης (1)","Πέλλας (2)","Ξάνθης (3)","Κιλκίς (3)","Φλώρινας (2)","Σερρών (3)","Δράμας (2)"},
            { "Άργος (4)","Άγιος Νικόλαος (4)","Άμφισσα (4)","Αλεξανδρούπολη (1)","Αργοστόλι (4)","Αγρίνιο (3)","Άρτα (3)","Αμαλιάδα (4)","Αίγιο (4)","Αθήνα (1)"},
            { "Ουρακοτάγκοι (3)","Άνθρωποι (2)","Μακάκοι (5)","Μαϊμούδες/Πίθηκοι (1)","Γορίλες (2)","Γίββωνες (5)","Λεμούριοι (5)","Καπουτσίνοι (5)","Μπαμπουίνοι (5)","Χιμπατζήδες (3)"},
            { "Rezonator (5)","Ρωσική/Επτάχορδη (5)","Γιουκαλίλι (4)","Δωδεκάχορδη (5)","Ηλεκτροακουστική κιθάρα (4)","Ακουστική (2)","Κιθάρα μπάσο (2)","Κλασσική (1)","Ηλεκτρική (1)","Κιθάρα Flamenco (5)"},
            { "Πλάτωνας (3)","Εν οίδα οτι ουδέν οίδα (3)","Διαλεκτική (5)","Διάλογος (5)","Φαιναρέτη (5)","Καινά Δαιμόνια (5)","Κώνειο (2)","Σωκρατική (μαιευτική) μέθοδος (4)","Φιλόσοφος (1)","Αρχαία Αθήνα (2)"},
            { "Σάμος (2)","Θάσος (2)","Λέσβος (1)","Σαμοθράκη (3)","Οινούσσες (5)","Χίος (1)","Τένεδος (5)","Ικαρία (3)","Άγιος Ευστράτιος (5)","Λήμνος (3)"},
            { "Βαλκανικοί (2)","Γιουγκοσλαβίας-Βοσνίας (4)","Κοσόβου (5)","Ιράν - Ιράκ  (2)","Βιετνάμ (3)","Έξι Ημερών (5)","Β’Παγκόσμιος (1)","Α’ Παγκόσμιος (1)","Κορέας (4)","Κόλπου (4)"},
            { "Crawling (5)","Breaking the Habit (5)","One step closer (5)","Numb(3)","Faint (5)","Given Up (5)","What i’ve done (5)","The Catalyst (5)","In the end (4)","Burn it down (5)"},
            { "Η γομολάστιχα (5)","Rock n’ roll στο κρεβάτι (5)","Χαρμάνης (5)","Στην Κ (5)","Ο Μπάμπης ο φλού (4)","Μη μου μιλάς για τίποτα (5)","Κρίμα το παιδί (5)","Να μ’αγαπας (4)","Κάποτε θα ‘ρθουν αν σου πουν (5)","Μου πες θα φύγω (5) "},
            { "Google (1)","Bing (3)","Altavista (5)","Baidu (5)","Yandex (5)","Ask.com (5)","Lycos (5)","Yahoo (2)","Metacrawler (5)","MywebSearch (5)"},
            { "Πρίγκιπας Αλβέρτος (4)","Γκριμάλντι (5)","Grand prix (3)","Πριγκιπάτο (4)","Πρίγκιπας Rainier III (5)","Κυανή Ακτή (5)","Monte Carlo (4)","Μονεγάσκοι (5)","Grace Patricia Kelly (5)","Καζίνο (4)"},
            { "Ιδρωτοποιοί αδένες (4)","Ωοθήκες (5)","Ήπαρ (4)","Όρχεις (4)","Πάγκρεας (4)","Μαστός (4)","Θυμός (5)","Θυρεοειδής (3)","Επινεφρίδια (5)","Σιελογόνοι αδένες (3)"},
            { "Λεονάρντο ντα Βίντσι (1)","Μιχαήλ Άγγελος (1)","Ραφαήλ (4)","Βερονέζε (5)","Τιντορέτο (5)","Καραβάτζιο (5)","Μοντιλιάνι (5)","Τιτσιανός (5)","Μποτιτσέλι (4)","Τζόρτζιο ντε Κίρικο (5)"},
            { "Παχύ έντερο (1)","Χοληδόχος κύστη (3)","Στομάχι (1)","Σπλήνας (2)","Πάγκρεας (2)","Νεφρός (1)","Ήπαρ (1)","Λεπτό έντερο (1)","Καρδιά (1)","Πνεύμονας (1)"},
            { "Τρίκαλα(61.653) (3)","Πάτρα(213.984) (1)","Ιωάννινα(89.061) (1)","Αθήνα(ΠΣ)(3.089.698) (1)","Ηράκλειο(167.971) (1)","Χαλκίδα(59.125) (4)","Λάρισα(144.651) (1)","Βόλος(120.733) (1)","Θεσσαλονίκη(ΠΣ)(788.952) (1)","Σέρρες(58.287) (3)"},
            { "Καναδάς(3,6 Μ) (3)","Κίνα(3,9 Μ) (2)","Ηνωμένα Αραβικά Εμιράτα (3,1 Μ) (2)","Κουβέιτ(2,9 Μ (5)","Βραζιλία(2,5 Μ) (3)","Η.Π.Α(15 Μ) (1)","Σαουδική Αραβία (2)","Ιράκ(4,4 Μ) (2)","Ρωσία(10,8 Μ) (2)","Ιράν(3,9 Μ) (2)"},
            { "Ηνωμένο Βασίλειο(5 νίκες) (1)","Νορβηγία (3 νίκες) (2)","Γερμανία (2 νίκες) (1)","Λουξεμβούργο (5 νίκες) (4)","Γαλλία(5 νίκες) (1)","Ολλανδία(5 νίκες) (2)","Σουηδία(6 νίκες) (1)","Δανία (3 νίκες) (3)","Ιρλανδία (7 νίκες) (3)","Αυστρία(2 νίκες) (4)"},
            { "Ουγγαρία (4)","Ρουμανία (3)","Αλβανία (3)","Γιουγκοσλαβία (4)","Σοβιετική Ένωση (3)","Πολωνία (4)","Τσεχοσλοβακία (4)","Μογγολία (5)","Βουλγαρία (3)","Ανατολική Γερμανία (5)"},
            { "Κνήμη (3)","Κλείδα (4)","Ωλένη (3)","Μηριαίο (3)","Κάτω γνάθος (4)","Κερκίδα (4)","Αστράγαλος (3)","Κόκκυγας (5)","Ωμοπλάτη (4)","Περόνη (3)"},
            { "Αετός (1)","Περιστέρι (1)","Γλάρος (2)","Τσαλαπετεινός (5)","Ορτύκι (4)","Γεράκι (2)","Πέρδικα (4)","Τσίχλα (3)","Κίσσα (5)","Καρακάξα (4)"},
            { "Λουξεμβούργο (4)","Σουηδία (1)","Βέλγιο (3)","Ρουμανία (4)","Δανία (3)","Σιγκαπούρη (5)","Ελβετία (2)","Ουγγαρία (4)","Νορβηγία (2)","Ολλανδία (2)"},
            { "Ουρουγουάη (3)","Χιλή (3)","Παραγουάη (3)","Ισπανία (1)","Μεξικό (1)","Αργεντινή (1)","Κούβα Β (3)","Κολομβία (3)","Γουατεμάλα (5)","Περού (3)"},
            { "Ουκρανία (4)","Γεωργία (4)","Ιράκ (2)","Ρωσία(Νότια) (2)","Κίνα (1)","Τουρκία (2)","Ιράν (2)","Αρμενία (4)","Μογγολία (2)","Καζακστάν (3)"},
            { "Ουαλία (3)","Ουζμπεκιστάν (2)","Ονδούρα (4)","Ουκρανία (1)","Ομόσπονδες Πολιτείες της Μικρονησίας (5)","Ομάν (3)","Ουρουγουάη (1)","Ολλανδία (1)","Ουγκάντα (3)","Ουγγαρία (1)"},
            { "Καραγκούνα (5)","Τσάμικος (2)","Κότσαρι(5)","Χασάπικος (3)","Ικαριώτικος (3)","Ζεϊμπέκικο (1)","Συρτάκι (2)","Πεντοζάλης(3)","Χασαποσέρβικο (3)","Καλαματιανός/ Συρτός (1)"},
            { "Αλέξης Τσίπρας (1)","Γεώργιος Α.Παπανδρέου (1)","Κωνσταντίνος Σημίτης (2)","Αντωνης Σαμαρας (2)","Κωνσταντίνος (Κώστας) Α.Καραμανλής (1)","Ανδρέας Γ.Παπανδρέου (1)","Τζάνης Τζανετάκης (5)","Κωνσταντίνος Μητσοτάκης (1)","Κυριάκος Μητσοτάκης (1)","Κωνσταντίνος Γ.Καραμανλής (1)"},
            { "Ηνωμένο Βασίλειο (2)","Ιαπωνία (1)","Γαλλία (1)","Κίνα (1)","Η.Π.Α (1)","Ν.Κορέα  (2)","Καναδάς (3)","Κίμωνας (3)","Γερμανία (1)" ,"Ρωσία (1)"},
            { "Κοζάνης (3)","Καστοριάς (3)","Δράμας (3)","Τρικάλων (3)","Κιλκίς (3)","Καρδίτσας (3)","Πέλλας (4)","Φλωρίνης (3)","Ιωαννίνων (2)","Γρεβενών (4)"},
            { "Νίκη της Σαμοθράκης (4)","Ποσειδώνας (ή Δίας) του Αρτεμισίου (4)","Θεά Αθηνα του Φειδία (Ακρόπολη) (2)","Ερμής του Πραξιτέλη (3)","Δισκοβόλος του Μύρωνα (5)","Ηνίοχος(Δελφούς) (5)","Καρυάτιδες (2)","Αφροδίτη της Μήλου (1)","Έφηβος των Αντικυθήρων (5)","Δίας του Φειδία (Αρχαία Ολυμπία)(3)"},
            { "Γαϊδούρας (3)","Αμυγδάλου (2)","Σοκολατούχο (2)","Κατσικίσιο/Γίδας (1)","Σόγιας (3)","Εβαπορέ  (2)","Μητρικό (4)","Ξινόγαλα (4)","Ζαχαρούχο (3)","Καρύδας(2)"},
            { "Λαγάνα (3)","Σταρένιο (4)","Τοστ (2)","Ζυμωτό (4)","Εφτάζυμο (5)","Μαύρο (1)","Σίκαλης (3)","Πολυτελείας (4)","Οκτάσπορο - πολύσπορο (1)","Χωριάτικο (2)"},
            { "Sunshine (2007) (5)","Gravity (2013) (4)","Armageddon(1998 (4))","2001: A Space Odyssey (1968) (4) ","Star Wars (1)","Alien/Prometheus (1979-2012)(4)","Interstellar (2014)(4)","Ad Astra (2019) (5)","Apollo 12 (1995) (4)","Star Trek (3)"},
            { "Λόφος της Γορίτσας (5)","Τσιπουράδικα (5)","Άγιος Κωνσταντίνος (3)","Πήλιο (4)","Αχίλλειο (3)","Θεσσαλία (4)","Αργοναύτες (4)","Συνοικία Παλαιά (5)","Οδός Αργοναυτών (1)","Παγασητικός Κόλπος (1)"},
            { "Η νύφη το ‘σκασε - Runaway Bride (1999) (5)","Ανθισμένες Μανόλιες (1989) (2)","Pretty Woman (1990) (5)","Erin Brockovich (2000) (2)","Το μυστικό στα μάτια τους - Secret in Their Eyes(2015)(5)","Μια βραδιά στο Notting Hill (1999) (2)","Eat Pray Love (2010) (5)","Oceans 11 (2001) (5)","Το χαμόγελο της Μόνα Λίζα (2003) (5)","Ο γάμος του καλύτερου μου φίλου (1997) (4)  "},
            { "Λεοντόκαρδος - Lionheart (1990) (4)","Παγκόσμιος Στρατιώτης - Universal Soldier (1992) (5)","Οι αναλώσιμοι 2  - The Expandables 2 (2012) (2)","Το βλέμμα του δράκου - Dragon Eyes (2012) (4)","Διπλός Αντίκτυπος - Double Impact (1991) (5)","Street Fighter (1994) (4) ","Δύσκολος Στόχος - Hard Target (1993) (4)","Bloodsport (1988)(4)","Kickboxer(1989) (5)","O Λεγεωνάριος - Legionnaire (4)"},
            { "Ιξιά (5)","Αφάντου (4)","Άντονυ Κουιν (5)","Άγιος Παύλος (5)","Τσαμπίκα (5)","Κολύμπια (5)","Φαληράκι (5)","Λαδικό (5)","Ιαλυσός (5)","Καλλιθέα (5)"},
            { "Ούλοφ Πάλμε (5)","IKEA (5)","ΑΒΒΑ (5)","Στοκχόλμη (5)","Volvo (5)","Saab (5)","Ιμπραχίμοβιτς (4)","Σκανδιναβία (5)","Σουηδική Κορώνα (5)","Βίκινγκς (5)"},
            { "Μονεμβασιά (5)","Μυστράς (3)","Επίδαυρος (5)","Ναός Επικούριου Απόλλων(Μεσσήνη) (2)","Κορώνη (4)","Μυκήνες (5)","Παλάτι Νέστορα(Πύλος) (4)","Αρχαία Κόρινθος (2)","Ολυμπία (5)","Μεθώνη (4)"},
            { "Αστυνόμος(4)","Υπαστυνόμος(4)","Αστυφύλακας (2)","Αντιστράτηγος (5)","Υπαρχιφύλακας (5)","Αστυνομικός Διευθυντής (3)","Αρχιφύλακας (5)","Ανθυπαστυνόμος (4)","Υποστράτηγος (2)","Ταξίαρχος (5)"},
            { "Ενυδατική(5)","Οδοντόκρεμα(5)","Αντιγηραντική(3)","Ματιών(4)","Νυκτός(3)","Αντιηλιακή(4)","Ημέρας(4)","Γάλακτος(5)","Καραμελέ(1)","Φρουτόκρεμα(1)"},
            { "Σίμπα(2)","Μουφάσα(4)","Σκαρ(4)","Ραφίκι(Μπαμπουίνος)(3)","Αγέλη(2)","Γκνου(3)","Ύαινες(3)","Χακούνα ματάτα(3)","Τιμόν και Πούμπα(3)","Περήφανος Βράχος(3)"},
            { "Ασύρτικο(2)","Μοσχοφίλερο(4)","Cabernet Sauvignon(4)","Αγιωργίτικο(5)","Merlot(5)","Ξινόμαυρο(5)","Μαυροδάφνη(5)","Syrah(4)","Μοσχάτο(3)","Cardonnay(5)"},
            { "Φέτα(5)","Αυγά(4)","Αλάτι(4)","Κρεμμύδι Φρέσκο(3)","Αλεύρι(5)","Άνηθο(5)","Πιπέρι(3)","Σπανάκι(5)","Ελαιόλαδο(4)","Νερό(5)"},
            { "Αριστοτέλους(1)","Ναυαρίνου(1)","Λαδάδικα(1)","Λιμάνι/Προβλήτα(3)","Σφαγεία(1)","Cosmos(3)","Αεροδρόμιο(1)","Βαλαωρίτου(1)","Κρήνη(1)","Παραλία(1)"},
            { "Μουσουλμάνοι - Ισλάμ(2)","Περσικός Κόλπος(4)","Σεΐχης(1)","Καμήλες(4)","Μέκκα(5)","Κουβέιτ (5)","Σαουδική Αραβία(5)","Ηνωμένα Αραβικά Εμιράτα(5)","Πετρέλαιο(5)","Έρημος(2)"}
            
        };
         int[][]points={ 
                                {4,5,5,2,2,2,2,2,5,5},
                                {5,5,3,4,3,4,4,5,1,1},
                                {3,4,2,2,1,1,1,2,2,1},   
                                {3,2,2,1,2,3,3,2,3,2},
                                {4,4,4,1,4,3,3,4,4,1},
                                {3,2,5,1,2,5,5,5,5,3},
                                {5,5,4,5,4,2,2,1,1,5},
                                {3,3,5,5,5,5,2,4,1,2},
                                {2,2,1,3,5,1,5,3,5,3},
                                {2,4,5,2,3,5,1,1,4,4},
                                {5,5,5,3,5,5,5,5,4,5},
                                {5,5,5,5,4,5,5,4,5,5},
                                {1,3,5,5,5,5,5,2,5,5},
                                {4,5,3,4,5,5,4,5,5,4},
                                {4,5,4,4,4,4,5,3,5,3},
                                {1,1,4,5,5,5,5,5,4,5},
                                {1,3,1,2,2,1,1,1,1,1},
                                {3,1,1,1,1,4,1,1,1,3},
                                {3,2,2,5,3,1,2,2,2,2},
                                {1,2,1,4,1,2,1,3,3,4},
                                {4,3,3,4,3,4,4,5,3,5},
                                {3,4,3,3,4,4,3,5,4,3},
                                {1,1,2,5,4,2,4,3,5,4},
                                {4,1,3,4,3,5,2,4,2,2},
                                {3,3,3,1,1,1,3,3,5,3},
                                {4,4,2,2,1,2,2,4,2,3},
                                {3,2,4,1,5,3,1,1,3,1},
                                {5,2,5,3,3,1,2,3,3,1},
                                {1,1,2,2,1,1,5,1,1,1},
                                {2,1,1,1,1,2,3,3,1,1},
                                {3,3,3,3,3,3,4,3,2,4},
                                {4,4,2,3,5,5,2,1,5,3},
                                {3,2,2,1,3,2,4,4,3,2},
                                {3,4,2,4,5,1,3,4,1,2},
                                {5,4,4,4,1,4,4,5,4,3},
                                {5,5,3,4,3,4,4,5,1,1},
                                {5,2,5,2,5,2,5,5,5,4},
                                {4,5,2,4,5,4,4,4,5,4},
                                {5,4,5,5,5,5,5,5,5,5},
                                {5,5,5,5,5,5,4,5,5,5},
                                {5,3,5,2,4,5,4,2,5,4},
                                {4,4,2,5,5,3,5,4,2,5},
                                {5,5,3,4,3,4,4,5,1,1},
                                {2,4,4,3,2,3,3,3,3,3},
                                {2,4,4,5,5,5,5,4,3,5},
                                {5,4,4,3,5,5,3,5,4,5},
                                {1,1,1,3,1,3,1,1,1,1},
                                {2,4,1,4,5,5,5,5,5,2},
                                
        
        };
        //analoga me posa tha exei vrei h omada tha emfanizw stis apantisis kapoio apo ta parakatw sxolia
        String[] comments={ "καλή προσπάθεια!!",
                            "καλύτερη τύχη στην επόμενη προσπάθεια!!",
                            "Μπράβο!!",
                            "Δεν γινόταν χειρότερα!!",
                            "καθόλου καλα δεν πήγε"
            
        };   
        char guess;
        char answer;
        int index=0;//arithmos gia ton pinaka
        int index1=0;
        int correct_guesses=0;
        int total_questions =questions.length; // xreiazomai to telos tou pinaka gia to if 
        int result []={0,0,0,0};//tha mpei sto fucntion tou result argotera arxiki timi 0 gia kathe omada      
        int seconds=10;//gia to xronometro argotera
        int end=0;
        int timerInitValue=30;
        Timer t;
        int gyros=0;
        int totalRounds=10; // default value
        
            
            
        
        
        
        //sal - upologismos sunolikwn round
        public void prepareTeam()
        {
            int RoundsSelected=Integer.parseInt(this.getSelectedButtonText(RoundsGroup));
            int  TeamsPlaying = Integer.parseInt(this.getSelectedButtonText(NumberOfTeamsGroup));
            totalRounds=RoundsSelected*TeamsPlaying - 1;
           // RoundProgress.setMaximum(totalRounds);

           // RoundProgress.setValue(totalRounds);
            
        }
        
        //sal afairesh-countdown twn gurwn
        public void roundsCountdown()
        {
             totalRounds--;
            
            //RoundProgress.setValue(totalRounds);
             
             if (totalRounds==1)
             {
                 NextRoundButton.setText("Τελος Παιχνιδιού");
             }
             
             if (totalRounds==0)
             {
                 jPanel5.hide();
                 Panel_Pontwn.hide();
                 WinnerPanel.show();
                 WinnerPanelDraw();
             }
        }
        
        
        public void WinnerPanelDraw()
        {


                ThirdTeamPanelLoser.hide();
                FourthTeamPanelLoser.hide();
                findWinner();

        }
        
        
        //sal euresh nikhth
        public void findWinner()
        {
             int  teams = Integer.parseInt(this.getSelectedButtonText(NumberOfTeamsGroup));
            
     
        int n = result.length;  
        int temp = 0; 
        String tempName=teamNames[0];
         for(int i=0; i < n; i++)
            {  
                 for(int j=1; j < (n-i); j++)
                 {  
                      if(result[j-1] < result[j])
                      {  
                      temp = result[j-1];
                      tempName=teamNames[j-1];
                      result[j-1] = result[j];  
                      result[j] = temp;  
                      teamNames[j-1]=teamNames[j];
                      teamNames[j]=tempName;

                       }  
                          
                 }
            }
//            String pointsFirst=Integer.toString(result[0]);
//            String pointsSecond=Integer.toString(result[1]);
//            String pointsThird=Integer.toString(result[2]);
//            String pointsFourth=Integer.toString(result[3]);
            
            FirstTeamPoints.setText(String.valueOf(result[0]));
            SecondTeamPoints.setText(String.valueOf(result[1]));

            panelSetFirstTeamName.setText(teamNames[0]);
            panelSetSecondTeamName.setText(teamNames[1]);
            
            
              if (teams==3)
              {
                ThirdTeamPoints.setText(String.valueOf(result[2]));
                panelSetThirdTeamName.setText(teamNames[2]);
                ThirdTeamPanelLoser.show();
              }
              
              if (teams==4)
              {
                ThirdTeamPoints.setText(String.valueOf(result[2]));
                panelSetThirdTeamName.setText(teamNames[2]);
                FourthTeamPoints.setText(String.valueOf(result[3]));
                panelSetFourthTeamName.setText(teamNames[3]);
                ThirdTeamPanelLoser.show();
                FourthTeamPanelLoser.show();
                
              }
            
            
            
            
            
         
        }
        
        
         public void nextQuestion(){

                
               // Erwtisi_omadas.setText(questions[index]);
                //pernaw ta onomata tou pinaka panw sta buttons wste meta na ginei to if gia tous pontous
                Button_1.setText(answers[index][0]);
                Button_2.setText(answers[index][1]);
                Button_3.setText(answers[index][2]);
                Button_4.setText(answers[index][3]);
                Button_5.setText(answers[index][4]);
                Button_6.setText(answers[index][5]);
                Button_7.setText(answers[index][6]);
                Button_8.setText(answers[index][7]);
                Button_9.setText(answers[index][8]);
                Button_10.setText(answers[index][9]); 
                index++;
            
            
        }
           public String[][] getAnswers(){
            return answers.clone(); // klwnopoiw ton trisdiastato pinaka wste na mporw na xrisimopoiw to antigrafo tou!
        }
    
         @Override
         //ena function gia elegxo twn buttons pou epilegthikan
        public void actionPerformed(ActionEvent e) {
           
        }
        
        
        
         public void updateTimeRemainingLabel() {
        
        //sal - timer - update to upoloipo tou xronou - se kathe tick
        if (this.timerInitValue > 0)  
        {
            this.timerInitValue = this.timerInitValue - 1;
            this.timerlabel.setText(Integer.toString(this.timerInitValue));
        }
        else 
        {
        jPanel1.hide();
        Panel_Pontwn.show();
        results();
        this.t.stop();
        }
    }
    
    public void initTimer(){
        //sal - timer - Xekinhma tou timer
        timerInitValue = Integer.parseInt(this.getSelectedButtonText(RoundDurationGroup));
        timerlabel.setText(Integer.toString(timerInitValue));
        t = new Timer(1000,new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                updateTimeRemainingLabel();
            }
        });
        t.start();
    }
    


        
     // ena function gia ta apotelesmata tis kathe omadas:
        public void results(){
            
        int  teams = Integer.parseInt(this.getSelectedButtonText(NumberOfTeamsGroup)); //thelw ton aritmo sto teams gia na bgei to panel me tous paiktes
        //ena if gia na emfanizei ta antistoixa jlabel twn omadwn:
        if(teams==2){
            jSeparator2.setVisible(false);
            Third_label.setVisible(false);
            Third_team_points.setVisible(false);
            jSeparator3.setVisible(false);
            jLabel3.setVisible(false);
            Fourth_team_points.setVisible(false);
        }else if(teams==3){
            jSeparator3.setVisible(false);
            jLabel3.setVisible(false);
            Fourth_team_points.setVisible(false);
        }
       
        int result_points=0;
        if(index>=total_questions){
            //last_Panel.show();
        }else{
           
          if (Button_1.isSelected()){
            if(gyros==0){
            result[0]=result[0] + points[index1][0];
            result_points=result_points+points[index1][0];
            }else if(gyros==1){
            result[1]=result[1] + points[index1][0];
            result_points=result_points+points[index1][0];
            }else if(gyros==2){
            result[2]=result[2] + points[index1][0];
            result_points=result_points+points[index1][0];
            }else{
            result[3]=result[3] + points[index1][0];
            result_points=result_points+points[index1][0];
            }
         
         }
         if (Button_2.isSelected()){
             if(gyros==0){
             result[0]=result[0] + points[index1][1];
             result_points=result_points+points[index1][1];
             }else if(gyros==1){
             result[1]=result[1] + points[index1][1];
             result_points=result_points+points[index1][1];
             }else if(gyros==2){
             result[2]=result[2] + points[index1][1];
            result_points=result_points+points[index1][1];
             }else{
            result[3]=result[3] + points[index1][1];
            result_points=result_points+points[index1][1];
             }
              
         }
         if (Button_3.isSelected()){
            if(gyros==0){
            result[0]=result[0] + points[index1][2];
            result_points=result_points+points[index1][2];
            }else if(gyros==1){
            result[1]=result[1] + points[index1][2];
            result_points=result_points+points[index1][2];
            }else if(gyros==2){
             result[2]=result[2] + points[index1][2];
            result_points=result_points+points[index1][2];
            }else{
            result[3]=result[3] + points[index1][2];
            result_points=result_points+points[index1][2];
            }
         
         }
         if (Button_4.isSelected()){
            if(gyros==0){
            result[0]=result[0] + points[index1][3];
            result_points=result_points+points[index1][3];
            }else if(gyros==1){
            result[1]=result[1] + points[index1][3];
            result_points=result_points+points[index1][3];
            }else if(gyros==2){
            result[2]=result[2] + points[index1][3];
            result_points=result_points+points[index1][3];
            }else{
            result[3]=result[3] + points[index1][3];
            result_points=result_points+points[index1][3];
            }
            
         }
         if (Button_5.isSelected()){
            if(gyros==0){
             result[0]=result[0] + points[index1][4];
             result_points=result_points+points[index1][4];
            }else if(gyros==1){
             result[1]=result[1] + points[index1][4];
             result_points=result_points+points[index1][4];
            }else if(gyros==2){
            result[2]=result[2] + points[index1][4];
            result_points=result_points+points[index1][4];
            }else{
            result[3]=result[3] + points[index1][4];
            result_points=result_points+points[index1][4];
            }
            
         }
        
         if (Button_6.isSelected()){
            if(gyros==0){
            result[0]=result[0] + points[index1][5];
            result_points=result_points+points[index1][5];
            }else if(gyros==1){
            result[1]=result[1] + points[index1][5];
            result_points=result_points+points[index1][5];
            }else if (gyros==2){
            result[2]=result[2] + points[index1][5];
            result_points=result_points+points[index1][5];
            }else{
            result[3]=result[3] + points[index1][5];
            result_points=result_points+points[index1][5];
            }
           
         }
         if (Button_7.isSelected()){
            if(gyros==0){
            result[0]=result[0] + points[index1][6];
            result_points=result_points+points[index1][6];
            }else if(gyros==1){
            result[1]=result[1] + points[index1][6];
            result_points=result_points+points[index1][6];
            }else if(gyros==2){
            result[2]=result[2] + points[index1][6];
            result_points=result_points+points[index1][6];
            }else{
            result[3]=result[3] + points[index1][6];
            result_points=result_points+points[index1][6];
            }
           
         }
         if (Button_8.isSelected()){
             if(gyros==0){
             result[0]=result[0] + points[index1][7];
             result_points=result_points+points[index1][7];
             }else if(gyros==1){
             result[1]=result[1] + points[index1][7];
             result_points=result_points+points[index1][7];
             }else if(gyros==2){
            result[2]=result[2] + points[index1][7];
            result_points=result_points+points[index1][7];
             }else{
            result[3]=result[3] + points[index1][7];
            result_points=result_points+points[index1][7];
             }
           
         }
         if (Button_9.isSelected()){
             if(gyros==0){
             result[0]=result[0] + points[index1][8];
             result_points=result_points+points[index1][8];
             }else if(gyros==1){
             result[1]=result[1] + points[index1][8];
             result_points=result_points+points[index1][8];
             }else if(gyros==2){
            result[2]=result[2] + points[index1][8];
            result_points=result_points+points[index1][8];
             }else{
            result[3]=result[3] + points[index1][8];
            result_points=result_points+points[index1][8];
             }
             
         }
         if (Button_10.isSelected()){
            if(gyros==0){
            result[0]=result[0] + points[index1][9];
            result_points=result_points+points[index1][9];
            }else if(gyros==1){
            result[1]=result[1] + points[index1][9];
            result_points=result_points+points[index1][9];
            }else if(gyros==2){
            result[2]=result[2] + points[index1][9];
            result_points=result_points+points[index1][9];
            }else{
            result[3]=result[3] + points[index1][9];
            result_points=result_points+points[index1][9];
            }
          
         }
         
         //prepei na emfanizw tis times gia kathe omada opote me ena if kathe gyrou mpainei sto antistoix jlabel oi pontoi
         
         if(teams==2){
            if(gyros==0){
            First_team_points.setText( Integer.toString(result[0]));
            results.setText( Integer.toString(result_points));
            gyros=gyros+1;
            }else{
            System.out.println(result[1]);
            Second_team_points.setText( Integer.toString(result[1]));
            results.setText( Integer.toString(result_points));
            gyros=gyros-1;
         }
         }else if(teams==3){
            if(gyros==0){
            First_team_points.setText( Integer.toString(result[0]));
            results.setText( Integer.toString(result_points));
            gyros=gyros+1;
            }else if(gyros==1){
            Second_team_points.setText( Integer.toString(result[1]));
            results.setText( Integer.toString(result_points));
            gyros=gyros+1;
             }else{
            Third_team_points.setText( Integer.toString(result[2]));
            results.setText( Integer.toString(result_points));
             gyros=gyros-2;}
        }else{
        
            if(gyros==0){
             First_team_points.setText( Integer.toString(result[0]));
             results.setText( Integer.toString(result_points));
             gyros=gyros+1;
             }else if(gyros==1){
             Second_team_points.setText( Integer.toString(result[1]));
             results.setText( Integer.toString(result_points));
             gyros=gyros+1;
            }else if(gyros==2){
            Third_team_points.setText( Integer.toString(result[2]));
            results.setText( Integer.toString(result_points));
             gyros=gyros+1;
            }else{
            Fourth_team_points.setText( Integer.toString(result[3]));
            results.setText( Integer.toString(result_points));
            gyros=gyros-3;
            }
    }

        if(result_points==0){
           String_Comments.setText(comments[3]);
        }else if(result_points<=3){
             String_Comments.setText(comments[4]);
         }else if(result_points<=6){
             String_Comments.setText(comments[1]);
         }else if(result_points<=12){
             String_Comments.setText(comments[0]);
         }else{
             String_Comments.setText(comments[2]);
        }
        
    }
        //ena if gia to apotelesma twn omadwn  sta sxolia tha mpoun ta label apo to panel tou apotelesmatos 
        if(teams==2){
            if(result[0]>result[1]){
                //nikaei h 1h omada
            }else{
                //nikaei h 2h omada
            }
        }else if(teams==3){
            if(result[0]>result[1] && result[0]>result[2]){
                //
            }else if (result[0]<result[1]&&result[1]>result[2]){
                //nikaei h 2h omada
            }else if(result[0]<result[2]&&result[1]<result[2]){
                //nikaei h 3h omada
            }
        }else {
             if(result[0]>result[1] && result[0]>result[2]&&result[0]>result[3]){
                //nikaei h 1h omada
            }else if (result[0]<result[1]&&result[1]>result[2]&&result[1]>result[3]){
                //nikaei h 2h omada
            }else if(result[0]<result[2]&&result[1]<result[2]&&result[2]>result[3]){
                //nikaei h 3h omada
            }else if(result[0]<result[3]&&result[1]<result[3]&&result[2]<result[3]){
                //nikaei h 4h omada
            }
        }
        index1++;
}
     
     //sal - onomata sto prepare panel
     int totalRoundCounter = 0;     
     String[]   teamNames={"","","",""};
     
     public void getNameOfTeam(){
         int  teams = Integer.parseInt(this.getSelectedButtonText(NumberOfTeamsGroup));
         
                  
        String text=SetFirstTeamName.getText();
        String text2=SecondTeamName.getText();
        String text3=Third_team_name.getText();
        String text4=Fourth_team_name.getText();
        
        teamNames[0] = text;
        teamNames[1] = text2;
        teamNames[2] = text3; 
        teamNames[3] = text4;

        
        switch(totalRoundCounter % teams) {
          case 0:
            get_team_name.setText(text);
            break;
          case 1:
            get_team_name.setText(text2);
            break;
          case 2:
            get_team_name.setText(text3);
            break;
          case 3:
            get_team_name.setText(text4);
            break;
        }
        
        totalRoundCounter++;
        
//         if(teams==2){
//             if (i[gyros]==0){
//                 get_team_name.setText(text);
//                 i[gyros]=i[gyros]+1;
//             }else{
//                 get_team_name.setText(text2);
//                 i[gyros]=i[gyros]-1;
//             }
//         }else if(teams==3){
//             if (i[gyros]==0){
//                 get_team_name.setText(text);
//                 i[gyros]=i[gyros]+1;
//             }else if(i[gyros]==1){
//                 get_team_name.setText(text2);
//                 i[gyros]=i[gyros]+1;
//             }else{
//                 get_team_name.setText(text3);
//                 i[gyros]=i[gyros]-2;
//             }
//         }else{
//             if (i[gyros]==0){
//                 get_team_name.setText(text);
//                 i[gyros]=i[gyros]+1;
//             }else if(i[gyros]==1){
//                 get_team_name.setText(text2);
//                 i[gyros]=i[gyros]+1;
//             }else if(i[gyros]==2){
//                 get_team_name.setText(text3);
//                 i[gyros]=i[gyros]+1;
//             }else{
//                 get_team_name.setText(text4);
//                 i[gyros]=i[gyros]-3;
//             }
//         }
     }   

    
    //SABBAS    
    public ergasia() {
        initComponents();
        scrumbleArrays();
        TeamSettingsPanel.hide();
        jPanel1.hide();
        Panel_Pontwn.hide();
        jPanel5.hide();
        WinnerPanel.hide();
        GameSettingsPanel.hide();
        StartScreen.show();
        
 
        
    }
    
    //Sal ++ Scrumble twn array gia tuxaies erwthseis
    public void scrumbleArrays() {
        
        int max = questions.length -1; 
        int min = 0; 
        int range = max; 
        for (int scrumble=0;scrumble<200;scrumble++)
        {
            
            int randIndexi=(int)(Math.random()*range);
            int randIndexy=(int)(Math.random()*range);
            String saveQ=questions[randIndexi];
            String[] saveA=answers[randIndexi];
            int[] saveP=points[randIndexi];
            questions[randIndexi]=questions[randIndexy];
            questions[randIndexy]=saveQ;
            answers[randIndexi]=answers[randIndexy];
            answers[randIndexy]=saveA;
            points[randIndexi]=points[randIndexy];
            points[randIndexy]=saveP;
        
        }
        
        
    }
    
    public void CreateTeamSettingsPanel()//savvas
{
      //pairnw αριθμο ομαδων
      int  teams = Integer.parseInt(this.getSelectedButtonText(NumberOfTeamsGroup));
   
      if (teams==3)
      {
         Team3Panel.show();
      }
     if (teams==4)
      {
         Team3Panel.show();
         Team4Panel.show();
      }
     
}
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) 
        {
            AbstractButton button = buttons.nextElement();
            
            if (button.isSelected()) 
            {
                return button.getText();
            }
        }
        return null;
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Team4Color = new javax.swing.ButtonGroup();
        Team3Color = new javax.swing.ButtonGroup();
        Team2Color = new javax.swing.ButtonGroup();
        Team1Color = new javax.swing.ButtonGroup();
        RoundDurationGroup = new javax.swing.ButtonGroup();
        RoundsGroup = new javax.swing.ButtonGroup();
        NumberOfTeamsGroup = new javax.swing.ButtonGroup();
        Panel_Pontwn = new javax.swing.JPanel();
        On_Top_Panel = new javax.swing.JPanel();
        Pontoi = new javax.swing.JLabel();
        String_Comments = new javax.swing.JLabel();
        results = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        First_team_name = new javax.swing.JLabel();
        First_team_points = new javax.swing.JLabel();
        Second_team_name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Second_team_points = new javax.swing.JLabel();
        Third_label = new javax.swing.JLabel();
        Third_team_points = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Fourth_team_points = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NextRoundButton = new javax.swing.JButton();
        GameSettingsPanel = new javax.swing.JPanel();
        GameSettings = new javax.swing.JLabel();
        NumofTeamsPanel = new javax.swing.JPanel();
        TeamsLabel = new javax.swing.JLabel();
        NumTeam2 = new javax.swing.JRadioButton();
        NumTeam3 = new javax.swing.JRadioButton();
        NumTeam4 = new javax.swing.JRadioButton();
        RoundsPanel = new javax.swing.JPanel();
        RoundsLabel = new javax.swing.JLabel();
        Rounds10 = new javax.swing.JRadioButton();
        Rounds20 = new javax.swing.JRadioButton();
        Rounds30 = new javax.swing.JRadioButton();
        Rounds40 = new javax.swing.JRadioButton();
        DurationPanel = new javax.swing.JPanel();
        Duration30 = new javax.swing.JRadioButton();
        Duration45 = new javax.swing.JRadioButton();
        Duration60 = new javax.swing.JRadioButton();
        Duration75 = new javax.swing.JRadioButton();
        Duration90 = new javax.swing.JRadioButton();
        DurationLabel = new javax.swing.JLabel();
        ConfirmPanel = new javax.swing.JPanel();
        MenuBackButton = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        TeamSettingsPanel = new javax.swing.JPanel();
        TeamSettings = new javax.swing.JLabel();
        Team1Panel = new javax.swing.JPanel();
        SetFirstTeamName = new javax.swing.JTextField();
        Team2Panel = new javax.swing.JPanel();
        SecondTeamName = new javax.swing.JTextField();
        Team3Panel = new javax.swing.JPanel();
        Third_team_name = new javax.swing.JTextField();
        Team4Panel = new javax.swing.JPanel();
        Fourth_team_name = new javax.swing.JTextField();
        ConfirmPanel1 = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        StartButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ypovoli_Button1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Button_1 = new javax.swing.JToggleButton();
        Button_2 = new javax.swing.JToggleButton();
        Button_3 = new javax.swing.JToggleButton();
        Button_4 = new javax.swing.JToggleButton();
        Button_5 = new javax.swing.JToggleButton();
        Button_6 = new javax.swing.JToggleButton();
        Button_7 = new javax.swing.JToggleButton();
        Button_8 = new javax.swing.JToggleButton();
        Button_9 = new javax.swing.JToggleButton();
        Button_10 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        Text_Question2 = new javax.swing.JLabel();
        timerlabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        prepareteam = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Text_Question1 = new javax.swing.JLabel();
        get_team_name = new javax.swing.JLabel();
        StartScreen = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        WinnerPanel = new javax.swing.JPanel();
        TopPanel = new javax.swing.JPanel();
        Pic = new javax.swing.JLabel();
        Vathmologia = new javax.swing.JLabel();
        BottomPanel = new javax.swing.JPanel();
        FirstTeamPanelWinner = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelSetFirstTeamName = new javax.swing.JLabel();
        FirstTeamPoints = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SecondTeamPanelLoser = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelSetSecondTeamName = new javax.swing.JLabel();
        SecondTeamPoints = new javax.swing.JLabel();
        ThirdTeamPanelLoser = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelSetThirdTeamName = new javax.swing.JLabel();
        ThirdTeamPoints = new javax.swing.JLabel();
        FourthTeamPanelLoser = new javax.swing.JPanel();
        panelSetFourthTeamName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FourthTeamPoints = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(550, 700));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        Panel_Pontwn.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Pontwn.setMinimumSize(new java.awt.Dimension(500, 500));
        Panel_Pontwn.setPreferredSize(new java.awt.Dimension(500, 650));

        On_Top_Panel.setBackground(new java.awt.Color(0, 128, 128));

        Pontoi.setBackground(new java.awt.Color(0, 0, 0));
        Pontoi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Pontoi.setForeground(new java.awt.Color(255, 255, 255));
        Pontoi.setText("Πόντοι:");

        String_Comments.setBackground(new java.awt.Color(0, 0, 0));
        String_Comments.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        String_Comments.setForeground(new java.awt.Color(255, 255, 255));
        String_Comments.setText("Σχόλια");

        results.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        results.setForeground(new java.awt.Color(255, 255, 255));
        results.setText("ποντοι");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("+");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scores.png"))); // NOI18N

        javax.swing.GroupLayout On_Top_PanelLayout = new javax.swing.GroupLayout(On_Top_Panel);
        On_Top_Panel.setLayout(On_Top_PanelLayout);
        On_Top_PanelLayout.setHorizontalGroup(
            On_Top_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(On_Top_PanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(On_Top_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(String_Comments)
                    .addGroup(On_Top_PanelLayout.createSequentialGroup()
                        .addComponent(Pontoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(results, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        On_Top_PanelLayout.setVerticalGroup(
            On_Top_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(On_Top_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(On_Top_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(results)
                    .addComponent(jLabel1)
                    .addComponent(Pontoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(String_Comments)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(148, 148, 148))
        );

        First_team_name.setBackground(new java.awt.Color(0, 0, 0));
        First_team_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        First_team_name.setText("First_team_name:");

        First_team_points.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        First_team_points.setText("0");

        Second_team_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Second_team_name.setText("Second_team_name:");

        Second_team_points.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Second_team_points.setText("0");

        Third_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Third_label.setText("Third_team_name:");

        Third_team_points.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Third_team_points.setText("0");

        Fourth_team_points.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Fourth_team_points.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Fourth_team_name:");

        NextRoundButton.setBackground(new java.awt.Color(255, 255, 255));
        NextRoundButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        NextRoundButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-square-solid-svg.png"))); // NOI18N
        NextRoundButton.setText("Επόμενος Γύρος");
        NextRoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextRoundButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(NextRoundButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NextRoundButton, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Panel_PontwnLayout = new javax.swing.GroupLayout(Panel_Pontwn);
        Panel_Pontwn.setLayout(Panel_PontwnLayout);
        Panel_PontwnLayout.setHorizontalGroup(
            Panel_PontwnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(On_Top_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_PontwnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_PontwnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Second_team_name)
                    .addComponent(Second_team_points, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Third_label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Third_team_points, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Fourth_team_points, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(First_team_name, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(First_team_points, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_PontwnLayout.setVerticalGroup(
            Panel_PontwnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PontwnLayout.createSequentialGroup()
                .addComponent(On_Top_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(First_team_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(First_team_points)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Second_team_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Second_team_points)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Third_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Third_team_points)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fourth_team_points)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        getContentPane().add(Panel_Pontwn, gridBagConstraints);

        GameSettingsPanel.setMinimumSize(new java.awt.Dimension(500, 500));
        GameSettingsPanel.setPreferredSize(new java.awt.Dimension(500, 650));

        GameSettings.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        GameSettings.setText("Ρυθμίσεις Παιχνιδιού");

        TeamsLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TeamsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-friends-solid-svg.png"))); // NOI18N
        TeamsLabel.setText("Αριθμός Ομάδων: ");

        NumberOfTeamsGroup.add(NumTeam2);
        NumTeam2.setSelected(true);
        NumTeam2.setText("2");
        NumTeam2.setBorderPainted(true);
        NumTeam2.setHideActionText(true);
        NumTeam2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumTeam2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NumTeam2.setMargin(new java.awt.Insets(8, 8, 8, 8));

        NumberOfTeamsGroup.add(NumTeam3);
        NumTeam3.setText("3");
        NumTeam3.setBorderPainted(true);
        NumTeam3.setMargin(new java.awt.Insets(8, 8, 8, 8));
        NumTeam3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumTeam3ActionPerformed(evt);
            }
        });

        NumberOfTeamsGroup.add(NumTeam4);
        NumTeam4.setText("4");
        NumTeam4.setBorderPainted(true);
        NumTeam4.setMargin(new java.awt.Insets(8, 8, 8, 8));
        NumTeam4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumTeam4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NumofTeamsPanelLayout = new javax.swing.GroupLayout(NumofTeamsPanel);
        NumofTeamsPanel.setLayout(NumofTeamsPanelLayout);
        NumofTeamsPanelLayout.setHorizontalGroup(
            NumofTeamsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumofTeamsPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(TeamsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumTeam2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumTeam3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumTeam4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NumofTeamsPanelLayout.setVerticalGroup(
            NumofTeamsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NumofTeamsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NumofTeamsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeamsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumTeam2)
                    .addComponent(NumTeam3)
                    .addComponent(NumTeam4)))
        );

        RoundsPanel.setPreferredSize(new java.awt.Dimension(523, 58));

        RoundsLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RoundsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circle-notch-solid-svg.png"))); // NOI18N
        RoundsLabel.setText("Αριθμός Γύρων: ");

        RoundsGroup.add(Rounds10);
        Rounds10.setSelected(true);
        Rounds10.setText("5");
        Rounds10.setBorderPainted(true);
        Rounds10.setMargin(new java.awt.Insets(8, 8, 8, 8));

        RoundsGroup.add(Rounds20);
        Rounds20.setText("10");
        Rounds20.setBorderPainted(true);
        Rounds20.setMargin(new java.awt.Insets(8, 8, 8, 8));

        RoundsGroup.add(Rounds30);
        Rounds30.setText("15");
        Rounds30.setBorderPainted(true);
        Rounds30.setMargin(new java.awt.Insets(8, 8, 8, 8));
        Rounds30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rounds30ActionPerformed(evt);
            }
        });

        RoundsGroup.add(Rounds40);
        Rounds40.setText("20");
        Rounds40.setBorderPainted(true);
        Rounds40.setMargin(new java.awt.Insets(8, 8, 8, 8));

        javax.swing.GroupLayout RoundsPanelLayout = new javax.swing.GroupLayout(RoundsPanel);
        RoundsPanel.setLayout(RoundsPanelLayout);
        RoundsPanelLayout.setHorizontalGroup(
            RoundsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoundsPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(RoundsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rounds10)
                .addGap(5, 5, 5)
                .addComponent(Rounds20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rounds30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rounds40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RoundsPanelLayout.setVerticalGroup(
            RoundsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoundsPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(RoundsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoundsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(Rounds10)
                    .addComponent(Rounds20)
                    .addComponent(Rounds30)
                    .addComponent(Rounds40)))
        );

        DurationPanel.setName(""); // NOI18N
        DurationPanel.setPreferredSize(new java.awt.Dimension(533, 50));

        RoundDurationGroup.add(Duration30);
        Duration30.setSelected(true);
        Duration30.setText("30");
        Duration30.setBorderPainted(true);
        Duration30.setMargin(new java.awt.Insets(8, 8, 8, 8));
        Duration30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Duration30ActionPerformed(evt);
            }
        });

        RoundDurationGroup.add(Duration45);
        Duration45.setText("45");
        Duration45.setBorderPainted(true);
        Duration45.setMargin(new java.awt.Insets(8, 8, 8, 8));

        RoundDurationGroup.add(Duration60);
        Duration60.setText("60");
        Duration60.setBorderPainted(true);
        Duration60.setMargin(new java.awt.Insets(8, 8, 8, 8));

        RoundDurationGroup.add(Duration75);
        Duration75.setText("75");
        Duration75.setBorderPainted(true);
        Duration75.setMargin(new java.awt.Insets(8, 8, 8, 8));
        Duration75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Duration75ActionPerformed(evt);
            }
        });

        RoundDurationGroup.add(Duration90);
        Duration90.setText("90");
        Duration90.setBorderPainted(true);
        Duration90.setMargin(new java.awt.Insets(8, 8, 8, 8));

        DurationLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DurationLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clock-solid-svg.png"))); // NOI18N
        DurationLabel.setText("Δευτερόλεπτα: ");

        javax.swing.GroupLayout DurationPanelLayout = new javax.swing.GroupLayout(DurationPanel);
        DurationPanel.setLayout(DurationPanelLayout);
        DurationPanelLayout.setHorizontalGroup(
            DurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DurationPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(DurationLabel)
                .addGap(1, 1, 1)
                .addComponent(Duration30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Duration45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Duration60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Duration75)
                .addGap(40, 40, 40)
                .addComponent(Duration90))
        );
        DurationPanelLayout.setVerticalGroup(
            DurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DurationPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(DurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Duration90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DurationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Duration30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Duration45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Duration60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Duration75))))
        );

        MenuBackButton.setBackground(new java.awt.Color(255, 255, 255));
        MenuBackButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        MenuBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bars-solid-svg.png"))); // NOI18N
        MenuBackButton.setText("Menu");
        MenuBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBackButtonActionPerformed(evt);
            }
        });

        NextButton.setBackground(new java.awt.Color(255, 255, 255));
        NextButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-square-solid-svg.png"))); // NOI18N
        NextButton.setText("Επόμενο");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConfirmPanelLayout = new javax.swing.GroupLayout(ConfirmPanel);
        ConfirmPanel.setLayout(ConfirmPanelLayout);
        ConfirmPanelLayout.setHorizontalGroup(
            ConfirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmPanelLayout.createSequentialGroup()
                .addComponent(MenuBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ConfirmPanelLayout.setVerticalGroup(
            ConfirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(MenuBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout GameSettingsPanelLayout = new javax.swing.GroupLayout(GameSettingsPanel);
        GameSettingsPanel.setLayout(GameSettingsPanelLayout);
        GameSettingsPanelLayout.setHorizontalGroup(
            GameSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameSettingsPanelLayout.createSequentialGroup()
                .addGroup(GameSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GameSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(NumofTeamsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GameSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RoundsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                        .addComponent(DurationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 419, Short.MAX_VALUE))
                    .addGroup(GameSettingsPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(ConfirmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        GameSettingsPanelLayout.setVerticalGroup(
            GameSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GameSettings)
                .addGap(63, 63, 63)
                .addComponent(NumofTeamsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(RoundsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(DurationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(ConfirmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        getContentPane().add(GameSettingsPanel, gridBagConstraints);

        TeamSettingsPanel.setPreferredSize(new java.awt.Dimension(500, 650));

        TeamSettings.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        TeamSettings.setText("Ονόματα ομάδων");

        Team1Panel.setBackground(new java.awt.Color(204, 0, 0));

        SetFirstTeamName.setText("Ονομα 1ής Ομάδας");
        SetFirstTeamName.setToolTipText("");
        SetFirstTeamName.setName("Ονομα 1ης Ομαδας"); // NOI18N
        SetFirstTeamName.setPreferredSize(new java.awt.Dimension(400, 120));
        SetFirstTeamName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetFirstTeamNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Team1PanelLayout = new javax.swing.GroupLayout(Team1Panel);
        Team1Panel.setLayout(Team1PanelLayout);
        Team1PanelLayout.setHorizontalGroup(
            Team1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Team1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SetFirstTeamName, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addContainerGap())
        );
        Team1PanelLayout.setVerticalGroup(
            Team1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Team1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SetFirstTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        Team2Panel.setBackground(new java.awt.Color(0, 204, 204));

        SecondTeamName.setText("Ονομα 2ης Ομαδας");
        SecondTeamName.setToolTipText("Ονομα 2ης Ομαδας");
        SecondTeamName.setName("Ονομα 2ης Ομαδας"); // NOI18N
        SecondTeamName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondTeamNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Team2PanelLayout = new javax.swing.GroupLayout(Team2Panel);
        Team2Panel.setLayout(Team2PanelLayout);
        Team2PanelLayout.setHorizontalGroup(
            Team2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Team2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SecondTeamName, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addContainerGap())
        );
        Team2PanelLayout.setVerticalGroup(
            Team2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Team2PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SecondTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Team3Panel.setBackground(new java.awt.Color(0, 153, 51));

        Third_team_name.setText("Ονομα 3ης Ομαδας");
        Third_team_name.setToolTipText("Ονομα 3ης Ομαδας");
        Third_team_name.setName("Ονομα 3ης Ομαδας"); // NOI18N
        Third_team_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Third_team_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Team3PanelLayout = new javax.swing.GroupLayout(Team3Panel);
        Team3Panel.setLayout(Team3PanelLayout);
        Team3PanelLayout.setHorizontalGroup(
            Team3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Team3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Third_team_name, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addContainerGap())
        );
        Team3PanelLayout.setVerticalGroup(
            Team3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Team3PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Third_team_name, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        Team4Panel.setBackground(new java.awt.Color(255, 255, 0));

        Fourth_team_name.setText("Ονομα 4ης Ομαδας");
        Fourth_team_name.setToolTipText("Ονομα 4ης Ομαδας");
        Fourth_team_name.setName("Ονομα 4ης Ομαδας"); // NOI18N
        Fourth_team_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fourth_team_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Team4PanelLayout = new javax.swing.GroupLayout(Team4Panel);
        Team4Panel.setLayout(Team4PanelLayout);
        Team4PanelLayout.setHorizontalGroup(
            Team4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Team4PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Fourth_team_name, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addContainerGap())
        );
        Team4PanelLayout.setVerticalGroup(
            Team4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Team4PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Fourth_team_name, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        BackButton.setBackground(new java.awt.Color(255, 255, 255));
        BackButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bars-solid-svg.png"))); // NOI18N
        BackButton.setText("Πίσω");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        StartButton.setBackground(new java.awt.Color(255, 255, 255));
        StartButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        StartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-square-solid-svg.png"))); // NOI18N
        StartButton.setText("Εναρξη");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConfirmPanel1Layout = new javax.swing.GroupLayout(ConfirmPanel1);
        ConfirmPanel1.setLayout(ConfirmPanel1Layout);
        ConfirmPanel1Layout.setHorizontalGroup(
            ConfirmPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ConfirmPanel1Layout.setVerticalGroup(
            ConfirmPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout TeamSettingsPanelLayout = new javax.swing.GroupLayout(TeamSettingsPanel);
        TeamSettingsPanel.setLayout(TeamSettingsPanelLayout);
        TeamSettingsPanelLayout.setHorizontalGroup(
            TeamSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeamSettingsPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(TeamSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TeamSettings)
                    .addComponent(Team1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Team2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Team3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Team4Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        TeamSettingsPanelLayout.setVerticalGroup(
            TeamSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeamSettingsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TeamSettings)
                .addGap(60, 60, 60)
                .addComponent(Team1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Team2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Team3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Team4Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(ConfirmPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(TeamSettingsPanel, new java.awt.GridBagConstraints());

        jPanel1.setBackground(new java.awt.Color(0, 128, 128));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 650));

        ypovoli_Button1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ypovoli_Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bars-solid-svg.png"))); // NOI18N
        ypovoli_Button1.setText("Αποτελέσματα");
        ypovoli_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ypovoli_Button1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 178, 178));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        Button_1.setFont(new java.awt.Font("KufiStandardGK", 1, 18)); // NOI18N
        Button_1.setToolTipText("");
        Button_1.setActionCommand("jToggleButton1");
        Button_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Button_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_1.setPreferredSize(new java.awt.Dimension(30, 30));
        Button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 550;
        gridBagConstraints.ipady = 5;
        jPanel3.add(Button_1, gridBagConstraints);

        Button_2.setFont(new java.awt.Font("KufiStandardGK", 1, 18)); // NOI18N
        Button_2.setToolTipText("");
        Button_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Button_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_2.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 550;
        gridBagConstraints.ipady = 5;
        jPanel3.add(Button_2, gridBagConstraints);

        Button_3.setFont(new java.awt.Font("KufiStandardGK", 1, 18)); // NOI18N
        Button_3.setToolTipText("");
        Button_3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Button_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_3.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 550;
        gridBagConstraints.ipady = 5;
        jPanel3.add(Button_3, gridBagConstraints);

        Button_4.setFont(new java.awt.Font("KufiStandardGK", 1, 18)); // NOI18N
        Button_4.setToolTipText("");
        Button_4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Button_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_4.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 550;
        gridBagConstraints.ipady = 5;
        jPanel3.add(Button_4, gridBagConstraints);

        Button_5.setFont(new java.awt.Font("KufiStandardGK", 1, 18)); // NOI18N
        Button_5.setToolTipText("");
        Button_5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Button_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_5.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 550;
        gridBagConstraints.ipady = 5;
        jPanel3.add(Button_5, gridBagConstraints);

        Button_6.setFont(new java.awt.Font("KufiStandardGK", 1, 18)); // NOI18N
        Button_6.setToolTipText("");
        Button_6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Button_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_6.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 550;
        gridBagConstraints.ipady = 5;
        jPanel3.add(Button_6, gridBagConstraints);

        Button_7.setFont(new java.awt.Font("KufiStandardGK", 1, 18)); // NOI18N
        Button_7.setToolTipText("");
        Button_7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Button_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_7.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 550;
        gridBagConstraints.ipady = 5;
        jPanel3.add(Button_7, gridBagConstraints);

        Button_8.setFont(new java.awt.Font("KufiStandardGK", 1, 18)); // NOI18N
        Button_8.setToolTipText("");
        Button_8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Button_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_8.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 550;
        gridBagConstraints.ipady = 5;
        jPanel3.add(Button_8, gridBagConstraints);

        Button_9.setFont(new java.awt.Font("KufiStandardGK", 1, 18)); // NOI18N
        Button_9.setToolTipText("");
        Button_9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Button_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_9.setPreferredSize(new java.awt.Dimension(30, 30));
        Button_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 550;
        gridBagConstraints.ipady = 5;
        jPanel3.add(Button_9, gridBagConstraints);

        Button_10.setFont(new java.awt.Font("KufiStandardGK", 1, 18)); // NOI18N
        Button_10.setToolTipText("");
        Button_10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Button_10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_10.setPreferredSize(new java.awt.Dimension(30, 30));
        Button_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 550;
        gridBagConstraints.ipady = 5;
        jPanel3.add(Button_10, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        Text_Question2.setBackground(new java.awt.Color(255, 255, 255));
        Text_Question2.setFont(new java.awt.Font("Mishafi Gold", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Text_Question2, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Text_Question2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
        );

        timerlabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        timerlabel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Χρόνος:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 157, Short.MAX_VALUE)
                .addComponent(ypovoli_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(ypovoli_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        jPanel5.setBackground(new java.awt.Color(0, 128, 128));
        jPanel5.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel5.setPreferredSize(new java.awt.Dimension(500, 650));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        prepareteam.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        prepareteam.setForeground(new java.awt.Color(255, 255, 255));
        prepareteam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prepareteam.setText("Ετοιμαστείτε!");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-square-solid-svg.png"))); // NOI18N
        jButton3.setText("Έναρξη Χρόνου");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        Text_Question1.setBackground(new java.awt.Color(255, 255, 255));
        Text_Question1.setFont(new java.awt.Font("Mishafi Gold", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text_Question1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(847, 847, 847))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(Text_Question1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        get_team_name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        get_team_name.setForeground(new java.awt.Color(255, 255, 255));
        get_team_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        get_team_name.setText("get.onoma.omadas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(get_team_name, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prepareteam, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 166, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(prepareteam, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(get_team_name, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel5, new java.awt.GridBagConstraints());

        StartScreen.setBackground(new java.awt.Color(255, 181, 88));
        StartScreen.setPreferredSize(new java.awt.Dimension(500, 650));
        StartScreen.setLayout(new java.awt.GridBagLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hourglass.png"))); // NOI18N
        jLabel13.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 124, 0, 133);
        StartScreen.add(jLabel13, gridBagConstraints);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton5.setText("Κανόνες");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 147, 143, 0);
        StartScreen.add(jButton5, gridBagConstraints);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton6.setText("Παιξε");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 164, 0, 0);
        StartScreen.add(jButton6, gridBagConstraints);

        getContentPane().add(StartScreen, new java.awt.GridBagConstraints());

        WinnerPanel.setPreferredSize(new java.awt.Dimension(500, 650));

        TopPanel.setBackground(new java.awt.Color(0, 128, 128));

        Pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cup3.png"))); // NOI18N

        Vathmologia.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        Vathmologia.setForeground(new java.awt.Color(255, 255, 255));
        Vathmologia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vathmologia.setText("Βαθμολογίες");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pic, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(Vathmologia, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Vathmologia, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        FirstTeamPanelWinner.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("1ος");

        panelSetFirstTeamName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelSetFirstTeamName.setText("setFirstTeamName");

        FirstTeamPoints.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FirstTeamPoints.setForeground(new java.awt.Color(102, 178, 178));
        FirstTeamPoints.setText("122");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cup-sm.png"))); // NOI18N

        javax.swing.GroupLayout FirstTeamPanelWinnerLayout = new javax.swing.GroupLayout(FirstTeamPanelWinner);
        FirstTeamPanelWinner.setLayout(FirstTeamPanelWinnerLayout);
        FirstTeamPanelWinnerLayout.setHorizontalGroup(
            FirstTeamPanelWinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstTeamPanelWinnerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addGap(44, 44, 44)
                .addComponent(panelSetFirstTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FirstTeamPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        FirstTeamPanelWinnerLayout.setVerticalGroup(
            FirstTeamPanelWinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FirstTeamPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelSetFirstTeamName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
        );

        SecondTeamPanelLoser.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("2ος");

        panelSetSecondTeamName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelSetSecondTeamName.setText("setSecondTeamName");

        SecondTeamPoints.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SecondTeamPoints.setForeground(new java.awt.Color(102, 178, 178));
        SecondTeamPoints.setText("122");

        javax.swing.GroupLayout SecondTeamPanelLoserLayout = new javax.swing.GroupLayout(SecondTeamPanelLoser);
        SecondTeamPanelLoser.setLayout(SecondTeamPanelLoserLayout);
        SecondTeamPanelLoserLayout.setHorizontalGroup(
            SecondTeamPanelLoserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondTeamPanelLoserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(119, 119, 119)
                .addComponent(panelSetSecondTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SecondTeamPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SecondTeamPanelLoserLayout.setVerticalGroup(
            SecondTeamPanelLoserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SecondTeamPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelSetSecondTeamName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ThirdTeamPanelLoser.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("3ος");

        panelSetThirdTeamName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelSetThirdTeamName.setText("setThirdTeamName");

        ThirdTeamPoints.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ThirdTeamPoints.setForeground(new java.awt.Color(102, 178, 178));
        ThirdTeamPoints.setText("122");

        javax.swing.GroupLayout ThirdTeamPanelLoserLayout = new javax.swing.GroupLayout(ThirdTeamPanelLoser);
        ThirdTeamPanelLoser.setLayout(ThirdTeamPanelLoserLayout);
        ThirdTeamPanelLoserLayout.setHorizontalGroup(
            ThirdTeamPanelLoserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThirdTeamPanelLoserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(119, 119, 119)
                .addComponent(panelSetThirdTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ThirdTeamPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ThirdTeamPanelLoserLayout.setVerticalGroup(
            ThirdTeamPanelLoserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThirdTeamPanelLoserLayout.createSequentialGroup()
                .addGroup(ThirdTeamPanelLoserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSetThirdTeamName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ThirdTeamPoints, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        FourthTeamPanelLoser.setBackground(new java.awt.Color(255, 255, 255));

        panelSetFourthTeamName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelSetFourthTeamName.setText("setFourthTeamName");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("4ος");

        FourthTeamPoints.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FourthTeamPoints.setForeground(new java.awt.Color(102, 178, 178));
        FourthTeamPoints.setText("122");

        javax.swing.GroupLayout FourthTeamPanelLoserLayout = new javax.swing.GroupLayout(FourthTeamPanelLoser);
        FourthTeamPanelLoser.setLayout(FourthTeamPanelLoserLayout);
        FourthTeamPanelLoserLayout.setHorizontalGroup(
            FourthTeamPanelLoserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FourthTeamPanelLoserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(119, 119, 119)
                .addComponent(panelSetFourthTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FourthTeamPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FourthTeamPanelLoserLayout.setVerticalGroup(
            FourthTeamPanelLoserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FourthTeamPanelLoserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(panelSetFourthTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(FourthTeamPoints, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout BottomPanelLayout = new javax.swing.GroupLayout(BottomPanel);
        BottomPanel.setLayout(BottomPanelLayout);
        BottomPanelLayout.setHorizontalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FirstTeamPanelWinner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SecondTeamPanelLoser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FourthTeamPanelLoser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ThirdTeamPanelLoser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BottomPanelLayout.setVerticalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottomPanelLayout.createSequentialGroup()
                .addComponent(FirstTeamPanelWinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SecondTeamPanelLoser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(ThirdTeamPanelLoser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FourthTeamPanelLoser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bars-solid-svg.png"))); // NOI18N
        jButton1.setText("Παίξτε Ξανα!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WinnerPanelLayout = new javax.swing.GroupLayout(WinnerPanel);
        WinnerPanel.setLayout(WinnerPanelLayout);
        WinnerPanelLayout.setHorizontalGroup(
            WinnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(WinnerPanelLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WinnerPanelLayout.setVerticalGroup(
            WinnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WinnerPanelLayout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        getContentPane().add(WinnerPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextRoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextRoundButtonActionPerformed
        Panel_Pontwn.hide();
        Text_Question2.setEnabled(false);
        Text_Question2.setText(questions[index]);
        Text_Question1.setEnabled(false);
        Text_Question1.setText(questions[index]); 
        jPanel5.show();
        roundsCountdown();
        getNameOfTeam();
       // WinnerPanelDraw();

    }//GEN-LAST:event_NextRoundButtonActionPerformed

        public void prepareForNextQuestion() {
        initTimer();
        Panel_Pontwn.hide();
        jPanel1.show();//πανελ ερωτησεων 
        Button_1.setSelected(false);
        Button_2.setSelected(false);
        Button_3.setSelected(false);
        Button_4.setSelected(false);
        Button_5.setSelected(false);
        Button_6.setSelected(false);
        Button_7.setSelected(false);
        Button_8.setSelected(false);
        Button_9.setSelected(false);
        Button_10.setSelected(false);
    }
 
    private void MenuBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBackButtonActionPerformed
        GameSettingsPanel.hide();
        StartScreen.show();
    }//GEN-LAST:event_MenuBackButtonActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        Team3Panel.hide();
        Team4Panel.hide();
        TeamSettingsPanel.show();
        GameSettingsPanel.hide();
        CreateTeamSettingsPanel();
        prepareTeam();


    }//GEN-LAST:event_NextButtonActionPerformed

    private void SetFirstTeamNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetFirstTeamNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetFirstTeamNameActionPerformed

    private void SecondTeamNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondTeamNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecondTeamNameActionPerformed

    private void Third_team_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Third_team_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Third_team_nameActionPerformed

    private void Fourth_team_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fourth_team_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fourth_team_nameActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        TeamSettingsPanel.hide();
        GameSettingsPanel.show();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        // me thn enarksi mpainoun oi erwthseis sta buttons ktlpa:
        TeamSettingsPanel.hide();
        Text_Question2.setEnabled(false);
        Text_Question2.setText(questions[index]);
        Text_Question1.setEnabled(false);
        Text_Question1.setText(questions[index]);
         jPanel5.show();
        //to function gia to onoma ths omadas
        getNameOfTeam();
 
    }//GEN-LAST:event_StartButtonActionPerformed

    private void Button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_1ActionPerformed

    private void Button_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_9ActionPerformed

    private void Button_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_10ActionPerformed

    private void ypovoli_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ypovoli_Button1ActionPerformed
        // kleinei to panel twn erwtisewn kai emfanizei to panel twn apotelesmatwn:
        jPanel1.hide();
        Panel_Pontwn.show();
        results();
        this.t.stop();
        String text=SetFirstTeamName.getText();
        String text2=SecondTeamName.getText();
        String text3=Third_team_name.getText();
        String text4=Fourth_team_name.getText();
        First_team_name.setText(text);
        Second_team_name.setText(text2);
        Third_label.setText(text3);
        jLabel3.setText(text4);
        
    }//GEN-LAST:event_ypovoli_Button1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        prepareForNextQuestion();
        nextQuestion();        // TODO add your handling code here:
        jPanel1.show();
        jPanel5.hide();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Duration75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Duration75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Duration75ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        StartScreen.hide();
        GameSettingsPanel.show();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Rounds30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rounds30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rounds30ActionPerformed

    private void NumTeam3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumTeam3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumTeam3ActionPerformed

    private void Duration30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Duration30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Duration30ActionPerformed

    private void NumTeam4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumTeam4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumTeam4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        index=0;//arithmos gia ton pinaka
        index1=0;
        correct_guesses=0;
        total_questions =questions.length; // xreiazomai to telos tou pinaka gia to if 
        result[0]=0;
        result[1]=0;
        result[2]=0;
        result[3]=0;
        First_team_points.setText("0");
        Second_team_points.setText("0");
        Third_team_points.setText("0");
        Fourth_team_points.setText("0");
        NextRoundButton.setText("Επόμενος ΄Γύρος");
        seconds=10;//gia to xronometro argotera
        end=0;
        timerInitValue=30;
        gyros=0;
        totalRounds=10; // default value
        WinnerPanel.hide();
        StartScreen.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ergasia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ergasia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ergasia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ergasia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ergasia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ergasia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ergasia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ergasia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ergasia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JToggleButton Button_1;
    private javax.swing.JToggleButton Button_10;
    private javax.swing.JToggleButton Button_2;
    private javax.swing.JToggleButton Button_3;
    private javax.swing.JToggleButton Button_4;
    private javax.swing.JToggleButton Button_5;
    private javax.swing.JToggleButton Button_6;
    private javax.swing.JToggleButton Button_7;
    private javax.swing.JToggleButton Button_8;
    private javax.swing.JToggleButton Button_9;
    private javax.swing.JPanel ConfirmPanel;
    private javax.swing.JPanel ConfirmPanel1;
    private javax.swing.JRadioButton Duration30;
    private javax.swing.JRadioButton Duration45;
    private javax.swing.JRadioButton Duration60;
    private javax.swing.JRadioButton Duration75;
    private javax.swing.JRadioButton Duration90;
    private javax.swing.JLabel DurationLabel;
    private javax.swing.JPanel DurationPanel;
    private javax.swing.JPanel FirstTeamPanelWinner;
    private javax.swing.JLabel FirstTeamPoints;
    private javax.swing.JLabel First_team_name;
    private javax.swing.JLabel First_team_points;
    private javax.swing.JPanel FourthTeamPanelLoser;
    private javax.swing.JLabel FourthTeamPoints;
    private javax.swing.JTextField Fourth_team_name;
    private javax.swing.JLabel Fourth_team_points;
    private javax.swing.JLabel GameSettings;
    private javax.swing.JPanel GameSettingsPanel;
    private javax.swing.JButton MenuBackButton;
    private javax.swing.JButton NextButton;
    private javax.swing.JButton NextRoundButton;
    private javax.swing.JRadioButton NumTeam2;
    private javax.swing.JRadioButton NumTeam3;
    private javax.swing.JRadioButton NumTeam4;
    private javax.swing.ButtonGroup NumberOfTeamsGroup;
    private javax.swing.JPanel NumofTeamsPanel;
    private javax.swing.JPanel On_Top_Panel;
    private javax.swing.JPanel Panel_Pontwn;
    private javax.swing.JLabel Pic;
    private javax.swing.JLabel Pontoi;
    private javax.swing.ButtonGroup RoundDurationGroup;
    private javax.swing.JRadioButton Rounds10;
    private javax.swing.JRadioButton Rounds20;
    private javax.swing.JRadioButton Rounds30;
    private javax.swing.JRadioButton Rounds40;
    private javax.swing.ButtonGroup RoundsGroup;
    private javax.swing.JLabel RoundsLabel;
    private javax.swing.JPanel RoundsPanel;
    private javax.swing.JTextField SecondTeamName;
    private javax.swing.JPanel SecondTeamPanelLoser;
    private javax.swing.JLabel SecondTeamPoints;
    private javax.swing.JLabel Second_team_name;
    private javax.swing.JLabel Second_team_points;
    private javax.swing.JTextField SetFirstTeamName;
    private javax.swing.JButton StartButton;
    private javax.swing.JPanel StartScreen;
    private javax.swing.JLabel String_Comments;
    private javax.swing.ButtonGroup Team1Color;
    private javax.swing.JPanel Team1Panel;
    private javax.swing.ButtonGroup Team2Color;
    private javax.swing.JPanel Team2Panel;
    private javax.swing.ButtonGroup Team3Color;
    private javax.swing.JPanel Team3Panel;
    private javax.swing.ButtonGroup Team4Color;
    private javax.swing.JPanel Team4Panel;
    private javax.swing.JLabel TeamSettings;
    private javax.swing.JPanel TeamSettingsPanel;
    private javax.swing.JLabel TeamsLabel;
    private javax.swing.JLabel Text_Question1;
    private javax.swing.JLabel Text_Question2;
    private javax.swing.JPanel ThirdTeamPanelLoser;
    private javax.swing.JLabel ThirdTeamPoints;
    private javax.swing.JLabel Third_label;
    private javax.swing.JTextField Third_team_name;
    private javax.swing.JLabel Third_team_points;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JLabel Vathmologia;
    private javax.swing.JPanel WinnerPanel;
    private javax.swing.JLabel get_team_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel panelSetFirstTeamName;
    private javax.swing.JLabel panelSetFourthTeamName;
    private javax.swing.JLabel panelSetSecondTeamName;
    private javax.swing.JLabel panelSetThirdTeamName;
    private javax.swing.JLabel prepareteam;
    private javax.swing.JLabel results;
    private javax.swing.JLabel timerlabel;
    private javax.swing.JButton ypovoli_Button1;
    // End of variables declaration//GEN-END:variables
}
